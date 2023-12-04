package com.atguigu.web.config;

import com.atguigu.web.component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

//@Configuration  //1.标注为配置类
////2.实现WebMvcConfigurer接口
//public class MyConfig implements WebMvcConfigurer {
//
//    //3.选择重写的方法，比如静态资源路径
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //以前的规则，只要不加上@EnableWebMvc那么默认配置默认有效，与删除不删除没关系
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//
//        //4.添加一条新规则
//        //添加的pathPatterns是客户端搜索某个路径，然后会去另一个路径下寻找
//        //前提是不能覆盖，比如“/**”默认找三路径，如果自己设置的pathPatterns是“/**”，那么会覆盖掉旧的
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/templates/");
//    }



@Profile("test")
@Configuration
public class MyConfig {

    @Profile("dev")
   @Bean
    public WebMvcConfigurer WebMvcConfigurer() {
       return new WebMvcConfigurer(){

           @Override
           public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
               converters.add(new MyYamlHttpMessageConverter());
           }
       };
   }
}
