package com.ocp.book.selikoff_boyarsky.practice_tests.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Question27 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Atlanta");
        list.add("Chicago");
        list.add("New York");

        list.stream().filter(String::isEmpty).forEach(System.out::println);
    }
}
