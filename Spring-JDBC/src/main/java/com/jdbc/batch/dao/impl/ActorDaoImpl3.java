package com.jdbc.batch.dao.impl;

import com.jdbc.batch.dao.ActorDao;
import com.jdbc.batch.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sun.rmi.log.LogInputStream;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ActorDaoImpl3 implements ActorDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createActorTable() {
        this.jdbcTemplate.execute("create table actor (id int, first_name varchar(50),last_name varchar(50))");
    }

    @Override
    public void insertActor(Actor actor) {
        this.jdbcTemplate.update("insert into actor (id,first_name,last_name) values (?,?,?)",
                actor.getId(),actor.getFirstName(),actor.getLastName());
    }

    @Override
    public List<Actor> selectActors() {
        List<Actor> actors = this.jdbcTemplate.query("select * from actor",
                new RowMapper<Actor>() {
                    @Override
                    public Actor mapRow(ResultSet resultSet, int i) throws SQLException {
                        Actor actor = new Actor();
                        actor.setFirstName(resultSet.getString("first_name"));
                        actor.setLastName(resultSet.getString("last_name"));
                        actor.setId(resultSet.getLong("id"));
                        return actor;
                    }
                });
        return actors;
    }


    @Override
    public int[] batchUpadate(final List<Actor> actorList) {
        List<Object[]> batch = new ArrayList<>();
        for (Actor actor : actorList){
            Object[] values = new Object[]{
                    actor.getFirstName(),actor.getLastName(),actor.getId()
            };
            batch.add(values);
        }
        return this.jdbcTemplate.batchUpdate("update actor set first_name = ?,last_name = ? where id = ?",
                batch);
    }
}
