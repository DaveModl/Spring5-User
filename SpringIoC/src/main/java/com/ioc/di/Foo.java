package com.ioc.di;

public class Foo {
    private Bar bar;
    private Fox fox;
    public Foo(Bar bar,Fox fox){
        this.bar = bar;
        this.fox = fox;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "bar=" + bar +
                ", fox=" + fox +
                '}';
    }
}
class Bar{

}
class Fox{

}
