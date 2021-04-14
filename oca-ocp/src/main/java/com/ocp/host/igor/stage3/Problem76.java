package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Problem76 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Chuck");
        Function<String, String> func = x -> "Hi ".concat(x);
        names.stream()
                .map(func)
                .peek(System.out::println);
    }
}
