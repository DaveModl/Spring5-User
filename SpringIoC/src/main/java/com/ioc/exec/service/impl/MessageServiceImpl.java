package com.ioc.exec.service.impl;

import com.ioc.exec.service.MessageService;

public class MessageServiceImpl implements MessageService {
    private String username;
    private int age;

    public MessageServiceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String getMessage() {
        return "Hello " + username + " age is " + age;
    }
}
