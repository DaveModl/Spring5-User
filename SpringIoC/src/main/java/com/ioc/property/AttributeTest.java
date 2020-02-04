package com.ioc.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AttributeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/property.xml");
        Attribute attribute = context.getBean(Attribute.class);
        System.out.println(attribute);
    }
}
