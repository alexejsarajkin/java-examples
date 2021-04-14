package com.ocp.book.selikoff_boyarsky.practice_tests.chapter15;

import java.util.stream.Stream;

public class Question23 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i);
        boolean b = stream.anyMatch(i -> i > 5);
        System.out.println(b);
    }
}
