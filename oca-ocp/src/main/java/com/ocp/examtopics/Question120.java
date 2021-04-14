package com.ocp.examtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question120 {
    public static void main(String[] args) throws IOException {
//        Stream<String> stream1 = Files.find(Paths.get("test.txt"));
//        stream1.forEach((String c) -> System.out.println(c));

//        Stream<Path> stream2 = Files.find(Paths.get("test.txt"));
//        stream2.forEach(c -> System.out.println(c));

//        Stream<Path> stream3 = Files.list(Paths.get("test.txt"));
//        stream3.forEach(c -> System.out.println(c));

        Stream<String> lines = Files.lines(Paths.get("test.txt"));
        lines.forEach(c -> System.out.println(c));
    }
}
