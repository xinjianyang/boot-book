package com.jian.security.controller;

import com.jian.security.mapper.UserMapper;
import com.jian.security.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinjian
 * @create 2018/4/30 0030
 */
@RestController
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("")
    public User getUser(){
       User user = userMapper.selectByPrimaryKey(1);
        return user;
    }
}
