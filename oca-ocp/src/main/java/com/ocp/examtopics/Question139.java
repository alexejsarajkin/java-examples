package com.ocp.examtopics;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question139 {
    public static void main(String[] args) {
        Locale locale1 = new Locale("de", "DE");
        ResourceBundle message = ResourceBundle.getBundle("MessageBundle", locale1);
        System.out.println(message.getString("inquiry"));

        Locale locale2 = new Locale.Builder().setLanguage("de").setRegion("DE").build();
        ResourceBundle message2 = ResourceBundle.getBundle("MessageBundle", locale2);
        System.out.println(message2.getString("inquiry"));
    }
}

// currentLocale = new Locale ("de", "DE");
// currentLocale = new Locale.Builder ().setLanguage ("de").setRegion ("DE").build();
