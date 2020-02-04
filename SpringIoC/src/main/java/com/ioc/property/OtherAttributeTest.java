package com.ioc.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OtherAttributeTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/property.xml");
        OtherAttribute attribute = context.getBean(OtherAttribute.class);
        System.out.println(attribute);
    }
}
