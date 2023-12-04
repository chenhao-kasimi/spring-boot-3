package com.atguigu.boot3.ssm.bean;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Profile("test")
@Component
@Data
public class Child {

    private String name;
    private Integer age;
    private Date birthDay;
    private List<String> text; //数组
}
