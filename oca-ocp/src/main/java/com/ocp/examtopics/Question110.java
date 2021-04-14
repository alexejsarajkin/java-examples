package com.ocp.examtopics;

import java.util.function.Predicate;

public class Question110 {
    public static void main(String[] args) {
        boolean res = new LengthValidator() {
            @Override
            public boolean checkLength(String str) {
                return str.length() > 5 && str.length() < 10;
            }
        }.checkLength("Hello");

        System.out.println(res);

        Predicate<String> predicate = str -> str.length() > 5 && str.length() < 10;

        System.out.println(predicate.test("Hello"));
    }
}

interface LengthValidator {
    public boolean checkLength(String str);
}

//  Predicate
