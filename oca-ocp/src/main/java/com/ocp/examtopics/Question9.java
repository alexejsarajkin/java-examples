package com.ocp.examtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question9 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("/green.txt");
        Path target = Paths.get("/colors/yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
    }
}
