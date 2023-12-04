package com.atguigu.boot3.ssm.bean;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Person {
    private Long id;
    private String userName;
    private String email;
    private Integer age;
}