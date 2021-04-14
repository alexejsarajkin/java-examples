package com.customer;

import com.product.Product;
import com.shop.Shop;

import java.util.List;

public class CustomerDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Customer customer = new Customer("Kolya Petrov");

        List<Product> products = customer.buyRandomProducts(shop);
        System.out.println(customer.getName() + " just bought " + products);
        shop.printTotalSales();

    }
}
