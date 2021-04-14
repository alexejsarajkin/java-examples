package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question85 {
    public static void main(String[] args) {
        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = s -> "Hello : ".concat(s);
        nL.stream()
                .map(funVal)
                .peek(System.out::print);
    }
}
