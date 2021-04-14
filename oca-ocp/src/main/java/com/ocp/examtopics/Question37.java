package com.ocp.examtopics;

import java.util.Arrays;
import java.util.List;

public class Question37 {
    public static void main(String[] args) {
        List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
        System.out.println(
                listVal.stream().filter(x -> x.length() > 3).count()
        );
    }
}
