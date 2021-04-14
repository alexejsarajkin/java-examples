package com.product;

public enum Product {
    BEEF(30.0), MILK(20.0), EGG(10.0);

    private double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
