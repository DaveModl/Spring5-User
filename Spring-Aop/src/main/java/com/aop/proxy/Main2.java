package com.aop.proxy;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        //使用代理
        ProxyFactory factory = new ProxyFactory(new SimplePojo());
        factory.addInterface(Pojo.class);
        factory.addAdvice(new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] objects, Object o) throws Throwable {
                System.out.println("before advice===>" + method.getName() + "传入参数" + Arrays.toString(objects)+ "操作对象" + o);
            }
        });
        factory.setExposeProxy(true);
        Pojo pojo = (Pojo) factory.getProxy();
        pojo.foo();
    }
}
