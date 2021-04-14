package com.ocp.examtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question133 {
    public static void main(String[] args) throws IOException {
        Stream<Path> list = Files.list(Paths.get("src/main"));
        list.forEach(s -> System.out.println(s));
    }
}

// Stream<Path> stream = Files.list (Paths.get ("/company/emp"));
