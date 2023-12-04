package com.atguigu.boot.boot1demo;

import com.atguigu.boot.boot1demo.bean.Cat;
import com.atguigu.boot.boot1demo.bean.Dog;
import com.atguigu.boot.boot1demo.bean.Person;
import com.atguigu.boot.boot1demo.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
public class Boot1DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Boot1DemoApplication.class, args);
        String[] names = ioc.getBeanDefinitionNames();

//        for(String s:names){
//            System.out.println(s);
//        }

//        for(String s :ioc.getBeanNamesForType(Cat.class)){
//            System.out.println("Cat:"+s);
//        }
//        for(String s :ioc.getBeanNamesForType(Dog.class)){
//            System.out.println("Dog:"+s);
//        }
//
//        for(String s :ioc.getBeanNamesForType(User.class)){
//            System.out.println("User:"+s);
//        }

        Cat cat = ioc.getBean(Cat.class);
        System.out.println("Cat:"+cat);

        Person person = ioc.getBean(Person.class);
        System.out.println("person:"+person);
    }
}
