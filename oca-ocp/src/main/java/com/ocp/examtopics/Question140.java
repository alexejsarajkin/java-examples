package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Question140 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("why ", "what ", "when ");
        BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2);
        String sen = words.stream()
                .reduce("Word: ", operator);
        System.out.println(sen);
    }
}

// Word: why what when
