package com.jdbc.service;

import com.jdbc.entity.User;

import java.util.List;

public interface UserService {
    void createUserTable();
    void saveUser(User user);
    List<User> selectUsers();
}
