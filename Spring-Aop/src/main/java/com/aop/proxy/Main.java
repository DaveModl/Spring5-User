package com.aop.proxy;

public class Main {
    public static void main(String[] args) {
        Pojo pojo = new SimplePojo();
        //直接调用对象
        pojo.foo();
    }
}
