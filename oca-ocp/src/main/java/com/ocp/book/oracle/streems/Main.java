package com.ocp.book.oracle.streems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Boi", 6);
        map.put("Zooey", 3);
        map.put("Charis", 8);
        System.out.println(map
                .entrySet()
                .stream()
                .filter(t -> t.getValue() > 4)
                .count()
        );

        System.out.println("-----------------------");

        Stream.of(1, 2, 3, 4, 5).forEach(System.out::print);
        System.out.println();
        IntStream intStream = IntStream.of(123, 456, 789);
        intStream.forEach(System.out::print);

        System.out.println("\n-----------------------");

        IntStream.range(10, 15).forEach(System.out::println);

        System.out.println("-----------------------");

        IntStream.rangeClosed(10, 15).forEach(System.out::println);

        System.out.println("-----------------------");

        IntStream.rangeClosed(0, 20)
                .filter(i -> i % 2 == 0)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-----------------------");

        IntStream.rangeClosed(0, 20)
                .filter(i -> i % 2 == 0)
                .skip(5)
                .forEach(System.out::println);
    }
}
