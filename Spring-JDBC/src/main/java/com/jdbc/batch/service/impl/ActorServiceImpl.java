package com.jdbc.batch.service.impl;

import com.jdbc.batch.dao.ActorDao;
import com.jdbc.batch.entity.Actor;
import com.jdbc.batch.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActorServiceImpl implements ActorService {
    private ActorDao actorDao;
@Autowired
    public void setActorDao(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @Override
    public void createActorTable() {
        this.actorDao.createActorTable();
    }

    @Override
    public void insertActor(Actor actor) {
    this.actorDao.insertActor(actor);
    }

    @Override
    public List<Actor> selectActors() {
        return this.actorDao.selectActors();
    }

    @Override
    public int[] batchUpadate(List<Actor> actorList) {
        return this.actorDao.batchUpadate(actorList);
    }
}
