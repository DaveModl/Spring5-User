package com.ioc.xml;

public class XmlConfig {
    public MyInterface myInterface(){
        return new MyInterfaceImpl();
    }
}

interface MyInterface{
    void doSometing();
}

class MyInterfaceImpl implements MyInterface{

    @Override
    public void doSometing() {
        System.out.println("method run...");
    }
}
