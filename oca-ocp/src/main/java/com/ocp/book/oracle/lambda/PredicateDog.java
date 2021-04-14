package com.ocp.book.oracle.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDog {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog boi = new Dog("boi", 30, 6);
        Dog clover = new Dog("clover", 35, 12);
        Dog zoo = new Dog("zoo", 46, 8);
        dogs.add(boi);
        dogs.add(clover);
        dogs.add(zoo);

        dogs.forEach(e -> System.out.println(e));

        System.out.println(">9");
        printDogIf(dogs, e -> e.getAge() > 9);
        System.out.println("<9");
        printDogIf(dogs, e -> e.getAge() < 9);

    }

    private static void printDogIf(List<Dog> dogs, Predicate<Dog> p) {
        for (Dog d : dogs) {
            if (p.test(d)) {
                System.out.println(d);
            }
        }
    }
}
