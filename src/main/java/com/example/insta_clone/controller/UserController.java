package com.example.insta_clone.controller;

import com.example.insta_clone.mapper.UserMapper;
import com.example.insta_clone.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserMapper userMapper;

    UserController(final UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @GetMapping("/user/all")
    public List<User> getUserList(){
        return userMapper.getUserList();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") final int id){
        return userMapper.getUser(id);
    }
}
