package com.transaction.declarative.service.impl;

import com.transaction.declarative.entity.User;
import com.transaction.declarative.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        //错误回滚
        throw new UnsupportedOperationException();
    }
}
