package com.ocp.book.oracle.streems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class StreamOfStream {
    public static void main(String[] args) throws IOException {
//		Stream<String> input = Files.lines(Paths.get("Java.txt"));
//		Stream<String[]> inputStream = input.map(line -> line.split(" "));
//		Stream<Stream<String>> streamStream = inputStream.map(array -> Arrays.stream(array));
//		Stream<String> ss = inputStream.flatMap(array -> Arrays.stream(array));

        long count = Files.lines(Paths.get("Java.txt"))
                .map(line -> line.split(" "))
                .flatMap(array -> Arrays.stream(array))
                .filter(e -> e.equals("Java"))
                .count();

        System.out.println(count);
    }
}
