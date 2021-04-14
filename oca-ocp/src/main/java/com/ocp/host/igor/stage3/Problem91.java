package com.ocp.host.igor.stage3;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Problem91 {
    public static void main(String[] args) {
        IntStream inStr = IntStream.of(1, 2, 3);
        IntFunction<IntUnaryOperator> inFunc = x -> y -> x * y; // line n1
        IntStream result = inStr.map(inFunc.apply(4)); // line n2
        result.forEach(System.out::print);
    }
}
