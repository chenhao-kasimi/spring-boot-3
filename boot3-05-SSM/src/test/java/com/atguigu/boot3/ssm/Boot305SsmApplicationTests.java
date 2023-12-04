package com.atguigu.boot3.ssm;

import com.atguigu.boot3.ssm.bean.User;
import com.atguigu.boot3.ssm.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class Boot305SsmApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        User user = userMapper.getUserById(1);

        System.out.println(user);
        log.info("User:"+user);
    }

    

}
