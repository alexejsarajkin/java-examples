package com.ocp.book.oracle.lambda;

import java.util.Map;
import java.util.TreeMap;

public class Functions {
    public static void main(String[] args) {
        Map<String, String> aprilWinner = new TreeMap<>();
        aprilWinner.put("April 2017", "Bob");
        aprilWinner.put("April 2016", "Annette");
        aprilWinner.put("April 2015", "Lamar");

        System.out.println("Before checking");
        aprilWinner.forEach((k, v) -> System.out.println(k + ":" + v));

        aprilWinner.computeIfAbsent("April 2014", (k) -> "John Doe");
        aprilWinner.computeIfAbsent("April 2014", (k) -> "Jahn Doe");

        System.out.println("After checking");
        aprilWinner.forEach((k, v) -> System.out.println(k + ":" + v));

        aprilWinner.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("After replacing");
        aprilWinner.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
