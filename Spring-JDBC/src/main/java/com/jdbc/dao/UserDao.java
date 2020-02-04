package com.jdbc.dao;

import com.jdbc.entity.User;

import java.util.List;

public interface UserDao {
    void createUserTable();
    void saveUser(User user);
    List<User> selectUsers();
}
