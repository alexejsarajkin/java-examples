package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem73 {
    public static void main(String[] args) {
        Stream<List<String>> listStream = Stream.of(
                Arrays.asList("1", "Smith"),
                Arrays.asList("2", null));
        IntStream intStream = listStream.flatMapToInt((x) -> x.stream().mapToInt(y -> y.length()));
        intStream.forEach(System.out::print);

//		Stream<List<String>> listStream = Stream.of(
//				Arrays.asList("1", "Smith"),
//				Arrays.asList("2", null));
//		IntStream intStream = listStream.flatMapToInt((x) -> x.stream());
    }
}
