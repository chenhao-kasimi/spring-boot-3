package com.atguigu.boot3.ssm;

import com.atguigu.boot3.ssm.bean.*;
import com.atguigu.boot3.ssm.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@MapperScan("com.atguigu.boot3.ssm.mapper")
@SpringBootApplication
public class Boot305SsmApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Boot305SsmApplication.class, args);
    }


}
