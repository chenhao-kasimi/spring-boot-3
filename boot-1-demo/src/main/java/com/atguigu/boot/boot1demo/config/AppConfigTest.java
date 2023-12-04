package com.atguigu.boot.boot1demo.config;


import com.atguigu.boot.boot1demo.bean.Cat;
import com.atguigu.boot.boot1demo.bean.Dog;
import com.atguigu.boot.boot1demo.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTest {

//    //当容器中没有类时执行下面
//    @ConditionalOnMissingClass(value = "com.atguigu.boot.boot1demo.bean.User")
//    @Bean
//    public Cat cat01(){
//        Cat cat = new Cat();cat.setId(1);cat.setName("Tom");return cat;
//    }
//
//    //当容器中有类时执行下面
//    @ConditionalOnClass(name = "com.atguigu.boot.boot1demo.bean.User")
//    @Bean
//    public Dog dog01(){
//        Dog dog = new Dog();dog.setId(1);
//        dog.setName("Tom");
//        return dog;
//    }
//
//    //当容器中有指定bean组件时执行下面
//    @ConditionalOnBean(Dog.class)
//    @Bean
//    public User zhangsan(){
//        User user = new User();
//        user.setId(1);
//        user.setName("Tom");
//        return user;
//    }
//
//    //当容器中没有指定bean组件时执行下面
//    @ConditionalOnMissingBean(Dog.class)
//    @Bean
//    public User lisi(){
//        User user = new User();
//        user.setId(1);
//        user.setName("Tom");
//        return user;
//    }

    @ConfigurationProperties(prefix = "cat")
    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        return cat;
    }


}
