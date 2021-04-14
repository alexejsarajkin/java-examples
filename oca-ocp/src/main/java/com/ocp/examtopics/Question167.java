package com.ocp.examtopics;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question167 {
    public static void main(String[] args) throws IOException {
        int maxDepth = 2;
        Stream<Path> paths = Files.find(
                Paths.get("sports"),
                maxDepth,
                (p, a) -> p.getFileName().toString().endsWith("txt"),
                FileVisitOption.FOLLOW_LINKS
        );

        Long fCount = paths
                .peek(System.out::println)
                .count();
        System.out.println(fCount);
    }
}

// 2
