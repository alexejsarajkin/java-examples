package com.ocp.book.selikoff_boyarsky.practice_tests.chapter15;

import java.util.Comparator;
import java.util.stream.Stream;

public class Question20 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("over the river", "through the woods",
                "to grandmother's house we go");
        s.filter(n -> n.startsWith("t"))
                .sorted(Comparator.comparing(e -> e))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
