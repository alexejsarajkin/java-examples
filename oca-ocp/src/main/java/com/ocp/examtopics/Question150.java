package com.ocp.examtopics;

import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

public class Question150 {
    public static void main(String[] args) {
        IntConsumer consumer = e -> System.out.println(e);
        Integer value = 90;

        ToIntFunction<Integer> funRef = e -> e + 10;
        int result = funRef.applyAsInt(value);

        consumer.accept(result);
    }
}

// ToIntFunction<Integer> funRef = e ""> e + 10; int result = funRef.applyAsInt (value);
