package com.el;

import com.el.entity.Entity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EntityTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/el.xml");
        Entity entity = context.getBean(Entity.class);
        System.out.println(entity);
    }
}
