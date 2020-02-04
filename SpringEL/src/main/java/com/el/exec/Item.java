package com.el.exec;

public class Item {
    private String goods;
    private double weight;

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "goods='" + goods + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
