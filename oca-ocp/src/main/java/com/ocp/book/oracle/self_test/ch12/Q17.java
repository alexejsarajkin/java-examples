package com.ocp.book.oracle.self_test.ch12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q17 {
    public static void main(String[] args) {
        Stream<List<String>> sDogNames = Stream.generate(
                () -> Arrays.asList("boi", "aiko", "charis", "zooey", "clover")
        ).limit(2).unordered();

        sDogNames.parallel()
                .flatMap(s -> s.stream())
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}
