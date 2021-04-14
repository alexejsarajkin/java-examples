package com.ocp.book.oracle.streems;

import com.ocp.book.oracle.lambda.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainSearching {
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

        boolean cName = dogs.stream()
                .filter(d -> d.getWeight() > 50)
                .anyMatch(d -> d.getName().startsWith("c"));

        System.out.println(cName);


        boolean isOlder = dogs.stream()
                .mapToInt(e -> e.getAge())
                .allMatch(a -> a > 5);

        System.out.println(isOlder);

        boolean notRed = dogs.stream()
                .map(e -> e.getName())
                .noneMatch(n -> "red".equals(n));

        System.out.println(notRed);

        Optional<Dog> dog = dogs.stream()
                .filter(e -> e.getWeight() > 50)
                .filter(e -> e.getName().startsWith("c"))
                .findAny();

        System.out.println(dog.isPresent() ? dog.get() : "Empty");

        Optional<Dog> dog5 = dogs.stream()
                .filter(d -> d.getAge() > 5)
                .peek(System.out::println)
                .findAny();

        dog5.ifPresent(System.out::println);
    }
}
