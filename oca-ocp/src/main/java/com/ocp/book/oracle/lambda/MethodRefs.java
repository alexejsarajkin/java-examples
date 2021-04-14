package com.ocp.book.oracle.lambda;

import java.util.Arrays;
import java.util.List;

public class MethodRefs {
    public static void main(String[] args) {
        List<String> trees = Arrays.asList("fir", "cedar", "pine");
        trees.forEach(MethodRefs::printTreeStatic);
    }

    public static void printTreeStatic(String t) {
        System.out.println("Tree name = " + t);
    }
}
