package com.el.exec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/shop.xml");

        ShopList list = (ShopList) context.getBean("list");
        System.out.println(list);

        ShopList list2 = (ShopList) context.getBean("list2");
        System.out.println(list2);

        ShopList list3 = (ShopList) context.getBean("list3");
        System.out.println(list3);

        ShopList list4 = (ShopList) context.getBean("list4");
        System.out.println(list4);

        ShopList list5 = (ShopList) context.getBean("list5");
        System.out.println(list5);

        ShopList list6 = (ShopList) context.getBean("list6");
        System.out.println(list6);

        ShopList list7 = (ShopList) context.getBean("list7");
        System.out.println(list7);

        ShopList list8 = (ShopList) context.getBean("list8");
        System.out.println(list8);

        ShopList list9 = (ShopList) context.getBean("list9");
        System.out.println(list9);

        ShopList list10 = (ShopList) context.getBean("list10");
        System.out.println(list10);

        ShopList list11 = (ShopList) context.getBean("list11");
        System.out.println(list11);

        ShopList list12 = (ShopList) context.getBean("list12");
        System.out.println(list12);


    }
}
