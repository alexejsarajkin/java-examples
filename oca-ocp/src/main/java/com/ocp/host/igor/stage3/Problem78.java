package com.ocp.host.igor.stage3;

import java.util.Arrays;
import java.util.List;

public class Problem78 {
    public static void main(String[] args) {
        List<String> planets = Arrays.asList("Mercury, 0",
                "Venus, 0",
                "Earth, 1",
                "Mars, 2");
        planets.stream()
                .filter(x -> x.contains("M"))
                .sorted()
                .forEach(System.out::println);    //line n1
    }
}
