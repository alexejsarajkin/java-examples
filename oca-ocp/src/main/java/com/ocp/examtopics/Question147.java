package com.ocp.examtopics;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question147 {
    public void loadResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Greetings", Locale.US);
//        System.out.println(resourceBundle.getObject(1));
    }

    public static void main(String[] args) {
        new Question147().loadResourceBundle();
    }
}

// Compilation fails.
