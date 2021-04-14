package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Question103 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);
        Function<Integer, Integer> function = f1 -> f1 + f1;
        Consumer<Integer> consumer = s -> System.out.println("val " + s);
        list.stream().map(function).forEach(consumer);
    }
}

// Val:20 Val:40 Val:60
