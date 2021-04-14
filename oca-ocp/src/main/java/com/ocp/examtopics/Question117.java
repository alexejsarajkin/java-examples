package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question117 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("", "George", "", "John", "Jim");
        Long val = list.stream()
                .filter(x -> !x.isEmpty())
                .count();

        System.out.println(val);
    }
}

// 3
