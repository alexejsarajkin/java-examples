package com.ocp.book.selikoff_boyarsky.review.ch4;

import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.allMatch(String::isEmpty);
        System.out.println(match);
    }
}
