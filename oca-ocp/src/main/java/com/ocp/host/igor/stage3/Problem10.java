package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Problem10 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2);
        UnaryOperator<Double> unop = x -> x + 1.0;
//		num.replaceAll(unop);
        num.forEach(x -> System.out.println(x));
    }
}
