package com.ocp.book.selikoff_boyarsky.review.ch3;

import java.util.HashSet;
import java.util.Set;

public class Question24 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        s.forEach(System.out::println);
    }
}
