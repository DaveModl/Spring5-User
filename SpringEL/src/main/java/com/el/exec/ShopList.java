package com.el.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopList {
    private String name;
    private int count;
    private double price;
    private List<Item> items = new ArrayList<>();
    private Item oneGood;
    private String[] allGoods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Item getOneGood() {
        return oneGood;
    }

    public void setOneGood(Item oneGood) {
        this.oneGood = oneGood;
    }

    public String[] getAllGoods() {
        return allGoods;
    }

    public void setAllGoods(String[] allGoods) {
        this.allGoods = allGoods;
    }

    @Override
    public String toString() {
        return "ShopList{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", items=" + items +
                ", oneGood=" + oneGood +
                ", allGoods=" + Arrays.toString(allGoods) +
                '}';
    }
}
