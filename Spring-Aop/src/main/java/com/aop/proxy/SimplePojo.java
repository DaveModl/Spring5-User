package com.aop.proxy;

import org.springframework.aop.framework.AopContext;

public class SimplePojo implements Pojo {
    @Override
    public void foo(){
        System.out.println("foo...");
        this.bar();
//        (AopContext.currentProxy()).bar();
    }

    public void bar() {
    }
}
