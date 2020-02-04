package com.jdbc.batch.dao.impl;

import com.jdbc.batch.dao.ActorDao;
import com.jdbc.batch.dao.ActorDao2;
import com.jdbc.batch.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ActorDaoImpl2 implements ActorDao2 {
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    @Override
    public int[] batchUpadate(final List<Actor> actorList) {
        return this.jdbcTemplate.batchUpdate("update actor set first_name = :firstName,last_name = :lastName where id = :id",
                SqlParameterSourceUtils.createBatch(actorList));
    }
}
