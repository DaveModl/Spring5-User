package com.jdbc.service.impl;

import com.jdbc.dao.UserDao;
import com.jdbc.dao.UserDao2;
import com.jdbc.entity.User;
import com.jdbc.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceimpl2 implements UserService2 {
    private UserDao2 userDao2;
@Autowired
    public void setUserDao2(UserDao2 userDao2) {
        this.userDao2 = userDao2;
    }

    @Override
    public int selectByName(String name) {
        return userDao2.selectByName(name);
    }
}
