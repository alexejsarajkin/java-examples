package com.ocp.book.oracle.concurrency;

import com.ocp.book.oracle.lambda.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog boi = new Dog("boi", 30, 6);
        Dog clover = new Dog("clover", 35, 12);
        Dog aiko = new Dog("aiko", 50, 10);
        Dog zoo = new Dog("zoo", 45, 8);
        Dog charis = new Dog("charis", 120, 7);
        dogs.add(boi);
        dogs.add(clover);
        dogs.add(aiko);
        dogs.add(zoo);
        dogs.add(charis);

        dogs.stream()
                .filter(e -> e.getAge() > 7)
                .forEach(System.out::println);

        System.out.println("-----------------------");

        dogs.stream()
                .parallel()
                .filter(e -> e.getAge() > 7)
                .forEach(System.out::println);

        System.out.println("-----------------------");

        dogs.stream()
                .parallel()
                .filter(e -> e.getAge() > 7)
                .forEachOrdered(System.out::println);

        System.out.println("-----------------------");

        List<Dog> dogsOlderThan7 = new ArrayList<>();
        dogs.stream()
                .parallel()
                .filter(e -> e.getAge() > 7)
                .peek(d -> dogsOlderThan7.add(d))
                .count();

        System.out.println(dogsOlderThan7);

        System.out.println("-----------------------");

        List<Dog> dogsOlderThan7_2 = Collections.synchronizedList(new ArrayList<>());
        dogs.stream()
                .parallel()
                .filter(e -> e.getAge() > 7)
                .peek(d -> dogsOlderThan7_2.add(d))
                .count();

        System.out.println(dogsOlderThan7_2);

        System.out.println("-----------------------");

        List<Dog> dogsOlderThan7_3 = dogs.stream()
                .parallel()
                .filter(e -> e.getAge() > 7)
                .collect(Collectors.toList());

        System.out.println(dogsOlderThan7_3);

        System.out.println("-----------------------");

    }
}
