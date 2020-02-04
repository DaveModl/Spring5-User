package com.jdbc.batch.dao;

import com.jdbc.batch.entity.Actor;

import java.util.List;

public interface ActorDao2 {
    int[] batchUpadate(List<Actor> actorList);
}
