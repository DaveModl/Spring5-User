package com.jdbc;

import com.jdbc.entity.User;
import com.jdbc.service.UserService;
import com.jdbc.service.UserService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/jdbc1.xml");
        UserService service = context.getBean(UserService.class);
        service.createUserTable();
        service.saveUser(new User("test1",10));
        service.saveUser(new User("test2",12));
        List<User> users = service.selectUsers();
        for (User user : users){
            System.out.println(user);
        }
        UserService2 service2 = context.getBean(UserService2.class);
       int age = service2.selectByName("test1");
        System.out.println(age);
    }
}
