package com.ioc.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {
    /**
     * 读取配置文件信息到Xml
     */
    @Value("#{properties['name']}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "name='" + name + '\'' +
                '}';
    }
}
