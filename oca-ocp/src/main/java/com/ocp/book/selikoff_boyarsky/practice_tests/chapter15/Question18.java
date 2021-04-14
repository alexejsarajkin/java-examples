package com.ocp.book.selikoff_boyarsky.practice_tests.chapter15;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class Question18 {
    public static void main(String[] args) {
        Stream<Boolean> bools = Stream.iterate(true, b -> !b);
        Map<Boolean, List<Boolean>> map = bools.limit(1)
                .collect(partitioningBy(b -> b));
        System.out.println(map);
    }
}
