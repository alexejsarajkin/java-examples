package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question109 {
    public static void main(String[] args) {
        Stream<List<String>> listStream = Stream.of(
                Arrays.asList("text1", "text2"),
                Arrays.asList("text3", "text")
        );

        Stream<String> stream = listStream
                .filter(b -> b.contains("text1"))
                .flatMap(rs -> rs.stream());
        stream.forEach(b -> System.out.println(b));
    }
}

// text1text2
