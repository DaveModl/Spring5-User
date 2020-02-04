package com.jdbc.batch.dao;

import com.jdbc.batch.entity.Actor;

import java.util.List;

public interface ActorDao {
    void createActorTable();
    void insertActor(Actor actor);
    List<Actor> selectActors();
    int[] batchUpadate(List<Actor> actorList);
}
