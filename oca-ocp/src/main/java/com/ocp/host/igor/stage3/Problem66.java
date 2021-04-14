package com.ocp.host.igor.stage3;

import java.util.Map;
import java.util.TreeMap;

public class Problem66 {
    public static void main(String[] args) {
        Map<Integer, String> students = new TreeMap<>();
        students.put(17, "Alice");
        students.put(12, "Chuck");
        students.put(11, "Brian");
        students.put(13, "Bob");
        System.out.println(students);
    }
}
