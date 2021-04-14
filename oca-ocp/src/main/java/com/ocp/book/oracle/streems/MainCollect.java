package com.ocp.book.oracle.streems;

import com.ocp.book.oracle.lambda.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainCollect {
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

        List<Dog> heavyDogs = dogs.stream()
                .filter(d -> d.getWeight() >= 50)
                .collect(Collectors.toList());

        heavyDogs.forEach(System.out::println);


    }
}
