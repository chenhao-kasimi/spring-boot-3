package com.atguigu.boot3.ssm.mapper;

import com.atguigu.boot3.ssm.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUserById(@Param("id") long id);
}
