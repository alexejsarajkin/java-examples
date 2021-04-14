package com.ocp.book.oracle.self_test.ch6;

import java.util.TreeSet;

public class Q13 {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>();
        TreeSet<String> sub = new TreeSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");

        sub = (TreeSet<String>) s.subSet("b", true, "d", true);
        s.add("g");
        s.pollFirst();
        s.pollFirst();
        s.add("c2");
        System.out.println(s.size() + " " + sub.size());
    }
}
