package com.atguigu.web.contoller;


import com.atguigu.web.bean.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@ResponseBody
@RestController
public class HelloController {

    @GetMapping("/a*/b?/{p1:[a-f]+}")
    public String hello(HttpServletRequest request,
                        @PathVariable("p1") String path) {

        log.info("路径变量p1： {}", path);
        //获取请求路径
        String uri = request.getRequestURI();
        return uri;
    }



    @RequestMapping("/person")
    public Person person(){
        Person person = new Person();
        person.setId(1L);
        person.setUserName("张三");
        person.setEmail("AAA@qq.com");
        person.setAge(18);
        return person;
    }

//    public static void main(String[] args) throws JsonProcessingException {
//        Person person = new Person();
//        person.setId(1L);
//        person.setUserName("张三");
//        person.setEmail("aaa@qq.com");
//        person.setAge(18);
//
//        //创建一个yaml类型的工厂。disable是修改默认不用管
//        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
//        //使用YAMLFactory创建一个objectMapper，objectMapper可以在底层将数据类型转换写出
//        ObjectMapper mapper = new ObjectMapper(factory);
//
//        //用objectMapper的方法将person以yaml格式写出
//        String s = mapper.writeValueAsString(person);
//        System.out.println(s);}
}
