package com.example.insta_clone.mapper;

import com.example.insta_clone.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUser(@Param("id") int id);

    @Select("SELECT * FROM user")
    List<User> getUserList();
}
