package com.ocp.examtopics;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Question128 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 30);
        BiConsumer<Integer, Integer> c = (i, j) -> {
            System.out.print(i + "," + j + "; ");
        };
        c.accept(1, 2);
        map.forEach(c);
    }
}

// BiConsumer<Integer,Integer> c = (i, j) -> {System.out.print (i + "," + j+ "; ");};
