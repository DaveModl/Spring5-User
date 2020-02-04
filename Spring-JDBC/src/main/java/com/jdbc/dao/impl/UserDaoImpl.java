package com.jdbc.dao.impl;

import com.jdbc.dao.UserDao;
import com.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void createUserTable() {
        this.jdbcTemplate.execute("create table user(name varchar(255),age int)");
    }

    @Override
    public void saveUser(User user) {
        this.jdbcTemplate.update("insert into user (name,age) values (?,?)",
                user.getName(),user.getAge());
    }

    @Override
    public List<User> selectUsers() {
        List<User> users = this.jdbcTemplate.query("select name,age from user",
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        User user = new User();
                        user.setName(resultSet.getString("name"));
                        user.setAge(resultSet.getInt("age"));
                        return user;
                    }
                });
        return users;
    }
}
