package com.ocp.book.oracle.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/alexeysaraikin/Java/java-core-examples/src/main/java/com/ocp/path/PathTest.java");
        System.out.println(path.getRoot());

        int spaces = 1;
        for (Path subPath : path) {
            System.out.format("%" + spaces + "s%s%n", "", subPath);
            spaces += 2;
        }

        Path path1 = Paths.get("..", "ava-core-examples");
        Files.createDirectories(path1);

    }
}
