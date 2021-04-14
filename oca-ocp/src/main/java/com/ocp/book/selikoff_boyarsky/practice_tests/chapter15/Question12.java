package com.ocp.book.selikoff_boyarsky.practice_tests.chapter15;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Question12 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
        BinaryOperator<String> merge = (a, b) -> a;
        Map<Integer, String> map = s.collect(toMap(String::length, k -> k, merge));
        System.out.println(map.size() + " " + map.get(4));
    }
}
