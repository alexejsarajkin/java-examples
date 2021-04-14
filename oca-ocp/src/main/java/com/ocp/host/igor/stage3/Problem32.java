package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Problem32 {
    public static void main(String[] args) {
        List<String> graces = Arrays.asList("faith", "hope", "love");
        Predicate<String> test = x -> {
            System.out.println("Still waiting...");
            return x.contains("love");
        };
        graces.stream()
                .filter(x -> x.length() >= 4)
                .allMatch(test);
    }
}
