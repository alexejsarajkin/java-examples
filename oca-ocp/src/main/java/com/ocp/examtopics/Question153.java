package com.ocp.examtopics;

import java.util.stream.IntStream;

public class Question153 {
    public static void main(String[] args) {
        IntStream str = IntStream.of(1, 2, 3, 4);
        Double result = str.average().getAsDouble();
        System.out.println(result);
    }
}
