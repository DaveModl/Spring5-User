package com.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/di.xml");
        Foo foo = context.getBean(Foo.class);
        System.out.println(foo);
        BasicArgs basicArgs = context.getBean(BasicArgs.class);
        System.out.println(basicArgs);
        SetterDI setterDI = context.getBean(SetterDI.class);
        System.out.println(setterDI);
    }
}
