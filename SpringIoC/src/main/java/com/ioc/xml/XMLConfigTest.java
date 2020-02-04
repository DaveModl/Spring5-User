package com.ioc.xml;

import com.ioc.xml.MyInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml");
        MyInterface myInterface = context.getBean("myInterface", MyInterface.class);
        System.out.println(myInterface);
    }
}
