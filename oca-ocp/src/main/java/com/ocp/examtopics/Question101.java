package com.ocp.examtopics;

import java.util.function.UnaryOperator;

public class Question101 {
    public static void main(String[] args) {
        final String str1 = "Java";
        StringBuffer stringBuffer = new StringBuffer("Course");
        UnaryOperator<String> u = (str2) -> str1.concat(str2);
        UnaryOperator<String> c = (str3) -> str3.toLowerCase();
//        System.out.println(u.apply(c.apply(stringBuffer))); // line n2
    }
}

// A compilation error occurs at line n2.
