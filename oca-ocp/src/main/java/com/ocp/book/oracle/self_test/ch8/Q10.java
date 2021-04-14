package com.ocp.book.oracle.self_test.ch8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Q10 {
    public static void main(String[] args) {
        BiFunction<Integer, String, String> foo = (n, s) -> {
            String newString = "";
            for (int i = 0; i < n; i++) {
                newString = s + " " + newString;
            }
            return newString;
        };
        Function<String, String> bar = (s) -> s + "bar";
        System.out.println(foo.andThen(bar).apply(3, "foo"));
    }
}
