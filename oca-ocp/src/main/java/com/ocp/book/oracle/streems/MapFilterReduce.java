package com.ocp.book.oracle.streems;

import java.util.Arrays;
import java.util.List;

public class MapFilterReduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        long result = nums.stream()
                .peek(n -> System.out.println("Number: " + n))
                .map(n -> n * n)
                .filter(n -> n > 20)
                .peek(n -> System.out.println("Square: " + n))
                .count();
        System.out.println("Result: " + result);
    }
}
