package com.ioc.annotion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public MyInterface2 myInterface2(){
        return new MyInterface2Impl();
    }

}

interface MyInterface2{
    void action();
}

class MyInterface2Impl implements MyInterface2{

    @Override
    public void action() {
        System.out.println("action...");
    }
}
