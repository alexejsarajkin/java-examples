package com.ocp.examtopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question163 {
    public static void main(String[] args) {
        List<Product163> products = new ArrayList<>(Arrays.asList(
                new Product163(1, 10),
                new Product163(2, 30),
                new Product163(3, 20)
        ));

        Product163 p = products.stream().reduce(
                new Product163(4, 0), (p1, p2) -> {
                    p1.price += p2.price;
                    return new Product163(p1.id, p1.price);
                });

        products.add(p);
        products.stream().parallel()
                .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
                .ifPresent(System.out::println);
    }
}

class Product163 {
    int id;
    int price;

    public Product163(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public String toString() {
        return id + ":" + price;
    }
}

// 4:60
