package com.mvc.rest.controller;

import com.mvc.rest.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/index")
    public String hello(){
        return "Say hello world.";
    }

    @RequestMapping("/hello/user")
    public User hello2(){
        return new User("Dave",26);
    }
}
