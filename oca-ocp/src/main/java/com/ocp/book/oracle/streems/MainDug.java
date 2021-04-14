package com.ocp.book.oracle.streems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainDug {
    public static void main(String[] args) {
        List<Duck> duckList = Arrays.asList(
                new Duck("Jerry", "yellow", 3),
                new Duck("George", "brown", 4),
                new Duck("Kramer", "mottled", 5),
                new Duck("Elaine", "white", 2),
                new Duck("Jerry", "mottled", 10),
                new Duck("George", "white", 12),
                new Duck("Kramer", "brown", 11),
                new Duck("Elaine", "brown", 13)
        );

        duckList.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------");

        duckList.stream()
                .sorted((d1, d2) -> d1.getAge() - d2.getAge())
                .forEach(System.out::println);

        System.out.println("-----------------");

        Comparator<Duck> byColor = Comparator.comparing(Duck::getColor);
        Comparator<Duck> byName = Comparator.comparing(Duck::getName);
        Comparator<Duck> byAge = Comparator.comparing(Duck::getAge);

        duckList.stream()
                .sorted(byAge)
                .forEach(System.out::println);

        System.out.println("-----------------");

        duckList.stream()
                .sorted(byName.thenComparing(byAge))
                .forEach(System.out::println);

        System.out.println("-----------------");

        duckList.stream()
                .map(d -> d.getColor())
                .distinct()
                .forEach(System.out::println);

    }
}
