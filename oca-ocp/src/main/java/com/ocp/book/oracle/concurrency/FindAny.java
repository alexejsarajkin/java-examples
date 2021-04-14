package com.ocp.book.oracle.concurrency;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAny {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0, 20);
        OptionalInt any = intStream.parallel()
                .peek(i -> System.out.println(i + " : " + Thread.currentThread().getName()))
                .filter(i -> i % 2 == 0 ? true : false)
                .findAny();

        System.out.println("any: " + any);
    }
}
