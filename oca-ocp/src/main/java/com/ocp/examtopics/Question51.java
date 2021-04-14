package com.ocp.examtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question51 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/data/december/log.txt");
        Path destination = Paths.get("/data");
        Files.copy(source, destination);
    }
}
