package com.shop;

import com.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    private List<Product> products;
    private Random rand = new Random();

    public Shop() {
        this.products = new ArrayList<>();
    }

    private Product getRandomProduct() {
        switch (rand.nextInt(3)) {
            case 0:
                return Product.BEEF;
            case 1:
                return Product.MILK;
        }
        ;
        return Product.EGG;
    }

    public List<Product> sellRandomProducts() {
        products.add(getRandomProduct());
        products.add(getRandomProduct());
        products.add(getRandomProduct());
        return products;
    }

    public void printTotalSales() {
        double totalSales =
                products.stream()
                        .mapToDouble(p -> p.getPrice())
                        .sum();

        System.out.println("Total sales: " + totalSales);
    }
}
