package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem56 {
    public static void main(String[] args) {
        List<ExamTaker> list = Arrays.asList(
                new ExamTaker("Alice", 98),
                new ExamTaker("Bob", 64),
                new ExamTaker("Chris", 72)
        );
        Predicate<ExamTaker> passed = e -> e.getScore() >= 65;              //line n1
        list = list.stream().filter(passed).collect(Collectors.toList());
        Stream<String> names = list.stream().map(ExamTaker::getName);       //line n2
        names.forEach(x -> System.out.print(x + " "));
    }
}

class ExamTaker {
    private String name;
    private Integer score;

    ExamTaker(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}