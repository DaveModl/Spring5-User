package com.jdbc.batch.dao;

import com.jdbc.batch.entity.Actor;

import java.util.Collection;
import java.util.List;

public interface ActorDao3 {
    int[][] batchUpadate(Collection<Actor> actorList);
}
