package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question125 {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(3, 4, 5);
        prices.stream()
                .filter(e -> e > 4)
                .peek(e -> System.out.println("Price " + e))
                .map(n -> n - 1)
                .forEach(n -> System.out.println(" New price " + n));
    }
}

// Replace line n3 with .forEach (n -> System.out.println ("New Price" + n));
