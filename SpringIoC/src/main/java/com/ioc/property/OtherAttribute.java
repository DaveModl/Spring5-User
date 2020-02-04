package com.ioc.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class OtherAttribute {
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties prop;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "OtherAttribute{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", prop=" + prop +
                ", name='" + name + '\'' +
                '}';
    }
}
