package com.ioc.annotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyInterface2 myInterface2 = context.getBean("myInterface2",MyInterface2.class);
        System.out.println(myInterface2);
    }
}
