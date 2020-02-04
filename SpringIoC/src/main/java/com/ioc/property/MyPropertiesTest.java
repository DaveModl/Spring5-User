package com.ioc.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPropertiesTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/property.xml");
        MyProperties properties = context.getBean(MyProperties.class);
        System.out.println(properties);
    }
}
