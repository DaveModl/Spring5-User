package com.jdbc.service.impl;

import com.jdbc.dao.UserDao;
import com.jdbc.entity.User;
import com.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
    private UserDao userDao;
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void createUserTable() {
        userDao.createUserTable();
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }
}
