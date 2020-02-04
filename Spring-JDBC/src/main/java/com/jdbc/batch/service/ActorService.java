package com.jdbc.batch.service;

import com.jdbc.batch.entity.Actor;

import java.util.List;

public interface ActorService {
    void createActorTable();
    void insertActor(Actor actor);
    List<Actor> selectActors();
    int[] batchUpadate(List<Actor> actorList);
}
