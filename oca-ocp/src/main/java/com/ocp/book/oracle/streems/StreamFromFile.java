package com.ocp.book.oracle.streems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFromFile {
    public static void main(String[] args) {
        String fileName = "/Users/alexeysaraikin/Java/java-core-examples/myProps2.props";
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
