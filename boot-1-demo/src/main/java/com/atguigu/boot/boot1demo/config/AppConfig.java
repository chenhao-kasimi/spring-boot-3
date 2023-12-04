package com.atguigu.boot.boot1demo.config;


import com.atguigu.boot.boot1demo.bean.Cat;
import com.atguigu.boot.boot1demo.bean.Dog;
import com.atguigu.boot.boot1demo.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnBean(Cat.class)
@Configuration  //标识当前类为配置类
public class AppConfig {


    @Bean  //使用@bean注解代替bean标签
    public User User(){
        User user = new User();
        user.setId(1);
        user.setName("one");
        return user;
    }
}
