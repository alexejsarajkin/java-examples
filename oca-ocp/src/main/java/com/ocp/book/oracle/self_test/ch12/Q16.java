package com.ocp.book.oracle.self_test.ch12;

import java.util.Optional;
import java.util.stream.Stream;

public class Q16 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            doIt();
        }
    }

    private static void doIt() {
        Stream<Integer> nums = Stream.of(10, 5, 3, 2);
        Optional<Integer> result = nums
                .parallel()
                .map(e -> e * 10)
                .reduce((n1, n2) -> n1 - n2);
        System.out.println(result);
    }

//	(100 - 30) - 20 = 100 - (30 - 20)
}
