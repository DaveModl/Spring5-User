package com.jdbc.batch.service;

import com.jdbc.batch.entity.Actor;

import java.util.List;

public interface ActorService2 {
    int[] batchUpadate(List<Actor> actorList);
}
