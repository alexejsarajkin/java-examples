package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question68 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3);
        values.stream()
                .map(n -> n * 2) //line n1
                .peek(System.out::print) //line n2
                .count();
    }
}
