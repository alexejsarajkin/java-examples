package com.ocp.examtopics;

import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        String[] strArray = new String[]{"Tiger", "Rat", "Cat", "Lion"};

        Arrays.sort(strArray, CheckClass::checkValue);

        for (String s : strArray) {
            System.out.print(s + " ");
        }
    }
}

class CheckClass {
    public static int checkValue(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
