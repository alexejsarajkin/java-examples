package com.ocp.book.oracle.streems;

import java.util.stream.Stream;

public class GenerationStreams {
    public static void main(String[] args) {
        Stream.iterate(0, s -> s + 1)
                .limit(4)
                .forEach(System.out::println);
    }
}
