package com.jdbc.batch;

import com.jdbc.batch.entity.Actor;
import com.jdbc.batch.service.ActorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class ActorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/batch.xml");
        ActorService actorService = context.getBean(ActorService.class);
        actorService.createActorTable();
        actorService.insertActor(new Actor(1L,"AA","aa"));
        actorService.insertActor(new Actor(2L,"BB","bb"));
        actorService.insertActor(new Actor(3L,"CC","cc"));
        List<Actor> actors = actorService.selectActors();
        System.out.println(actors);
        List<Actor> actorsUpdate = new ArrayList<>();
        actorsUpdate.add(new Actor(1L,"AaA","AaaA"));
        actorsUpdate.add(new Actor(2L,"bBb","bBBb"));
        actorService.batchUpadate(actorsUpdate);
        List<Actor> actors2 = actorService.selectActors();
        System.out.println(actors2);


    }
}
