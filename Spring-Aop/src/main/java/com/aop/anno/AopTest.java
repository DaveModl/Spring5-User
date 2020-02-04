package com.aop.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop1.xml");
        Tiger tiger = context.getBean(Tiger.class);
        tiger.walk();
    }
}
