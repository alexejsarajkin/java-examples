package com.ocp.examtopics;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Question88 {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
        ResourceBundle messages = ResourceBundle.getBundle("MessageBundle", locale);
        Enumeration<String> names = messages.getKeys();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String value = messages.getString(key);
            System.out.println(key + " = " + value);
        }
    }
}
