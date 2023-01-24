package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserMapper userMapper;

    UserController(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @GetMapping("/user/all")
    public List<User> getUserList(){
        return userMapper.getUserList();
    }
}
