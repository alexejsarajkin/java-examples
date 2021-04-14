package com.ocp.host.igor.stage3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Problem52 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("Java.txt");


//		List<String> fc = Files.list(file);
//		fc.stream().forEach(x -> System.out.println(x));

//		Stream<String> fc = Files.readAllLines(file);
//		fc.forEach(x -> System.out.println(x));

//		 List<String> fc = readAllLines(file);
//		fc.stream().forEach(x -> System.out.println(x));

        Stream<String> fc = Files.lines(file);
        fc.forEach(x -> System.out.println(x));
    }
}
