package com.ioc.di;

import java.beans.ConstructorProperties;

public class BasicArgs {
    private int id;
    private String name;
//    @ConstructorProperties({"id","name"}),指定构造器参数名字
    public BasicArgs(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BasicArgs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
