package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Question130 {
    public static void main(String[] args) {
        List<Product130> list = Arrays.asList(
                new Product130("TV", 1000),
                new Product130("Refrigerator", 2000)
        );
        Consumer<Product130> raise = e -> e.setPrice(e.getPrice() + 100);
        list.forEach(raise);
        list.stream().forEach(Product130::printVal);
    }
}

class Product130 {
    String name;
    Integer price;

    public Product130(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void printVal() {
        System.out.println(name + " " + price);
    }
}

// TV Price :1100 Refrigerator Price :2100
