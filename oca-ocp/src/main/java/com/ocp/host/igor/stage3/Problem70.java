package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Problem70 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Gold Rush", "Gold Flakes", "Gold Nuggets");
        Predicate<String> mesh1 = x -> x.length() > 3;

        Predicate mesh2 = new Klondike() {
            public boolean test(String str) {
                return str.contains("Gold");
            }
        };

        long num = list.stream()
                .filter(mesh1)
                .filter(mesh2)
                .count();

        System.out.println(num);
    }
}


interface Klondike extends Predicate<String> {
    public default boolean test(String str) {
        return str.equals("Gold");
    }
}


class Test12 implements Klondike {

}
