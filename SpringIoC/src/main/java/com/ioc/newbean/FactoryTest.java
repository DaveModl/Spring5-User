package com.ioc.newbean;

/**
 * 工厂方法实例化bean
 */
public class FactoryTest {
    private static Factory factory = new FactoryImpl();

    private FactoryTest(){}

    public Factory getFactory(){
        return factory;
    }
}
interface Factory{

}
class FactoryImpl implements Factory{

}