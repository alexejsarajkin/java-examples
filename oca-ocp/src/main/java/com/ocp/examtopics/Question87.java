package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question87 {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("MotherBoard", 5),
                new Product("Speaker", 20)
        );

        productList.stream()
                .filter(Product.ProductFilter::isAvailable)
                .forEach(product -> System.out.println(product));
    }
}

class Product {
    String name;
    int qty;

    @Override
    public String toString() {
        return super.toString();
    }

    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    static class ProductFilter {
        public static boolean isAvailable(Product p) {
            return p.qty >= 10;
        }
    }
}
