package com.oca;

import java.util.Arrays;

public class Sudoku {
    static int[][] game = new int[6][6];

    public static void main(String[] args) {
        String[] os = new String[]{"Mac", "Linux", "Windows"};
        Arrays.sort(os);
        System.out.println(Arrays.binarySearch(os, "RedHat"));
    }
}
