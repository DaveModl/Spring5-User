package com.jdbc.batch.service.impl;

import com.jdbc.batch.dao.ActorDao;
import com.jdbc.batch.dao.ActorDao2;
import com.jdbc.batch.entity.Actor;
import com.jdbc.batch.service.ActorService;
import com.jdbc.batch.service.ActorService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl2 implements ActorService2 {
    private ActorDao2 actorDao2;
@Autowired
    public void setActorDao(ActorDao actorDao) {
        this.actorDao2 = actorDao2;
    }

    @Override
    public int[] batchUpadate(List<Actor> actorList) {
        return this.actorDao2.batchUpadate(actorList);
    }
}
