package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Insert;
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

    //@Insert("INSERT INTO user VALUES()")
    //int insertUser()
}
