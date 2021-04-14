package com.customer;

import com.product.Product;
import com.shop.Shop;

import java.util.List;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public List<Product> buyRandomProducts(Shop shop) {
        return shop.sellRandomProducts();
    }

    public String getName() {
        return name;
    }
}
