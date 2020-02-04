package com.el.entity;

public class Entity {
    private int randomNum;

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "randomNum=" + randomNum +
                '}';
    }
}
