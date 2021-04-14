package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question100 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Java EE", "Java ME");
        boolean java = list.stream().allMatch(w -> w.equals("Java"));
        System.out.println(java);
    }
}
