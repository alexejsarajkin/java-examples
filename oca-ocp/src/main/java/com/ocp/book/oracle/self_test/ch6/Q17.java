package com.ocp.book.oracle.self_test.ch6;

import java.util.Arrays;
import java.util.Comparator;

public class Q17 {

    public static void main(String[] args) {
        String[] s = {"map", "pen", "marble", "key"};
        Othello o = new Othello();
        Arrays.sort(s, o);
        for (String s2 : s) System.out.println(s2 + " ");
        System.out.println(Arrays.binarySearch(s, "map"));

    }

    static class Othello implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}
