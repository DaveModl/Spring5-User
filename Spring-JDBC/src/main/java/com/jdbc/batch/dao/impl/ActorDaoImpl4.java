package com.jdbc.batch.dao.impl;

import com.jdbc.batch.dao.ActorDao3;
import com.jdbc.batch.entity.Actor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class ActorDaoImpl4 implements ActorDao3 {
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public int[][] batchUpadate(Collection<Actor> actorList) {
        int[][] updateCounts = jdbcTemplate.batchUpdate("update actor set first_name = ?,last_name = ? where id = ?",
                actorList,
                100,
                new ParameterizedPreparedStatementSetter<Actor>() {
                    @Override
                    public void setValues(PreparedStatement ps, Actor actor) throws SQLException {
                        ps.setString(1,actor.getFirstName());
                        ps.setString(2,actor.getLastName());
                        ps.setLong(3,actor.getId().longValue());
                    }
                });
        return updateCounts;
    }
}
