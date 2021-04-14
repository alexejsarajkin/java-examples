package com.ocp.examtopics;

import java.text.NumberFormat;
import java.util.Locale;

public class Question108 {
    public static void main(String[] args) {
        double d = 15;
        Locale locale = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(d));
    }
}

// $15.00
