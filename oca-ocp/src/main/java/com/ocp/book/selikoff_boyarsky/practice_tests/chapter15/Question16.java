package com.ocp.book.selikoff_boyarsky.practice_tests.chapter15;

import java.util.stream.Stream;

public class Question16 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("base", "ball");
        stream.mapToInt(s -> s.length()).forEach(System.out::print);
    }
}
