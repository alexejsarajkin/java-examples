package com.ocp.book.oracle.self_test.ch9;

import java.util.Arrays;
import java.util.OptionalInt;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums)
                .reduce(0, (n1, n2) -> n1 + n2);

        OptionalInt sumO = Arrays.stream(nums)
                .reduce((n1, n2) -> n1 + n2);
    }
}
