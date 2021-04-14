package com.ocp.book.oracle.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDog {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog boi = new Dog("boi", 30, 6);
        Dog clover = new Dog("clover", 35, 12);
        Dog zoo = new Dog("zoo", 46, 8);
        dogs.add(boi);
        dogs.add(clover);
        dogs.add(zoo);

        Consumer<Dog> displayName = d -> System.out.print(d + " ");
        dogs.forEach(displayName.andThen(d -> d.bark()));
    }
}
