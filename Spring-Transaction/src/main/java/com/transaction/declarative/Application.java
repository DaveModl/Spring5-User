package com.transaction.declarative;

import com.transaction.declarative.entity.User;
import com.transaction.declarative.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/transaction.xml");
        UserService userService = context.getBean(UserService.class);
        userService.saveUser(new User("Dave",26));
    }
}
