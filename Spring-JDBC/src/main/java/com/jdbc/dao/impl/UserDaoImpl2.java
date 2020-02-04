package com.jdbc.dao.impl;

import com.jdbc.dao.UserDao;
import com.jdbc.dao.UserDao2;
import com.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl2 implements UserDao2 {
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public int selectByName(String name) {
        String sql = "select age from user where name =:name";
        SqlParameterSource parameterSource = new MapSqlParameterSource("name",name);
        /**
         * 注，如果是多条字段查询必须转成List
         */
        return this.jdbcTemplate.queryForObject(sql,parameterSource, Integer.class);
    }
}
