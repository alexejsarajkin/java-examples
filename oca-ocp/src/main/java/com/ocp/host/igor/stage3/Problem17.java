package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Problem17 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unop = x -> x * 2;             // line 1
        List<Double> nums = Arrays.asList(10.0, 20.0);
        nums.stream()
                .filter(x -> x > 15.0)
//				.map(x -> unop.apply(x))                        // line 2
                .forEach(x -> System.out.print(x));
    }
}
