package com.el.exec;

public class Tax {
    private double ctax;
    private String name;
    public static String getCountry(){
        return "zh_CN";
    }

    public double getCtax() {
        return ctax;
    }

    public void setCtax(double ctax) {
        this.ctax = ctax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
