package com.ocp.examtopics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question116 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle(2, "Car"),
                new Vehicle(3, "Bike"),
                new Vehicle(1, "Truck")
        );

        vehicles.stream()
                .sorted((v1, v2) -> Integer.compare(v1.getId(), v2.getId()))
                .forEach(System.out::println);

        vehicles.stream()
                .sorted(Comparator.comparing((Vehicle v) -> v.getId()))
                .forEach(System.out::println);
    }
}

class Vehicle {
    int id;
    String name;

    public Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// sorted((v1, v2) -> Integer.compare(v1.getVId(), v2.getVid()))
// sorted(Comparator.comparing ((Vehicle v) -> v.getVId()))
