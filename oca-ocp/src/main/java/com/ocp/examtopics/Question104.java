package com.ocp.examtopics;

import java.util.Optional;

public class Question104 {
    public static Optional<String> getCountry(String loc) {
        Optional<String> couName = Optional.empty();

        if ("Paris".equals(loc))
            couName = Optional.of("France");
        else if ("Mumbai".equals(loc))
            couName = Optional.of("India");

        return couName;
    }

    public static void main(String[] args) {
        Optional<String> city1 = getCountry("Paris");
        Optional<String> city2 = getCountry("Las Vegas");

        System.out.println(city1.orElse("Not found"));

        if (city2.isPresent())
            city2.ifPresent(e -> System.out.println(e));
        else
            System.out.println(city2.orElse("Not found"));
    }
}

// France Not Found
