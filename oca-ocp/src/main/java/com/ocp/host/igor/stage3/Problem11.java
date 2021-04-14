package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem11 {
    public static void main(String[] args) {
        List<Dog> kennels = Arrays.asList(
                new Dog("Oliver", "Collie"),
                new Dog("Sam", "Beagle"),
                new Dog("Jack", "Beagle"));
        kennels.stream()
                .sorted(Comparator.comparing(Dog::getBreed).reversed().thenComparing(Dog::getName))
                .collect(Collectors.toList());
    }

    static class Dog {
        String name;
        String breed;

        public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }
    }
}
