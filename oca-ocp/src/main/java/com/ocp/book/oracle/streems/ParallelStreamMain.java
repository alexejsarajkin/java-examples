package com.ocp.book.oracle.streems;

import java.util.stream.Stream;

public class ParallelStreamMain {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallel()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

        System.out.println("-----------------------");

        Stream.of("boi", "chairs", "zooey", "aiko")
                .forEach(System.out::println);

        System.out.println("-----------------------");

        Stream.of("boi", "chairs", "zooey", "aiko")
                .parallel()
                .forEach(System.out::println);
    }
}
