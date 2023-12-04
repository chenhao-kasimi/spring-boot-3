package com.atguigu.boot3.ssm.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {

    private Long id;


    private String loginName;
    private String nickName;
    private int password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password=" + password +
                '}';
    }
}
