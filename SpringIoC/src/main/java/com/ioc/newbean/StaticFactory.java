package com.ioc.newbean;

public class StaticFactory {
    private static StaticFactory factory = new StaticFactory();
    private StaticFactory(){}
/**静态工厂方法实例化bean*/
    public static StaticFactory getFactory() {
        return factory;
    }
}
