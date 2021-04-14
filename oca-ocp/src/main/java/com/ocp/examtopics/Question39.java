package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question39 {
    public static void main(String[] args) {
        List<Product39> products = Arrays.asList(
                new Product39(1, 10),
                new Product39(2, 30),
                new Product39(2, 30));

        Product39 p = products.stream().reduce(
                new Product39(4, 0),
                (p1, p2) -> {
                    p1.price += p2.price;
                    return new Product39(p1.id, p1.price);
                });


        products.add(p);


        products.stream().parallel()
                .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
                .ifPresent(System.out::println);
    }
}

class Product39 {
    int id;
    int price;

    public Product39(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public String toString() {
        return id + ":" + price;
    }
}
