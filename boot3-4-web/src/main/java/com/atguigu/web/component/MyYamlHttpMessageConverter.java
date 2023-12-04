package com.atguigu.web.component;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//由于是一个MessageConverter，所以需要实现MessageConverter接口或者继承于默认实现类AbstractHttpMessageConverter<>,
// 泛型表示支持什么类型写为你想要的类型
public class MyYamlHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

    private ObjectMapper objectMapper=null;

    //构造器启动时创建一个objectMapper用于数据转换
    public MyYamlHttpMessageConverter(){

        //告诉SpringBoot这个MessageConverter支持哪种媒体类型
        //需要跟配置类的设置对应
        super(new MediaType("text", "yaml", Charset.forName("UTF-8")));

        //创建一个yaml类型的工厂。disable是修改默认不用管
        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        //使用YAMLFactory创建一个objectMapper，objectMapper可以在底层将数据类型转换写出
        objectMapper= new ObjectMapper(factory);
    }


    @Override
    //表示支不支持某种类型 获取到类型后可进行判断，不符合可返回false，比如支不支持Student写出为yaml
    protected boolean supports(Class<?> clazz) {
        //表示支持所有对象类型(.lass)，不支持基本类型
        return true;
    }

    @Override
    //请求带来的数据如何转为指定的对象
    //与@requestBody配合 比如客户端传输一个json类型数据，转为Person
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    //与@ResponseBody配合，将指定对象转为客户端需要的数据类型
    protected void writeInternal(Object methodReturnValue, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        //try-with写法，自动关流
        try(OutputStream os = outputMessage.getBody()){
            this.objectMapper.writeValue(os,methodReturnValue);
        }

    }
}
