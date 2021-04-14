package com.ocp.other;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle rbDefault = ResourceBundle.getBundle("Labels");
        System.out.println(rbDefault.getString("hello"));

        Locale localeCZ = new Locale("cz");
        ResourceBundle rbCZ = ResourceBundle.getBundle("Labels", localeCZ);
        System.out.println(rbCZ.getString("hello"));

        Locale locale = new Locale("fr", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
        System.out.println(rb.getString("hello.fr"));
        System.out.println(rb.getString("hello.fr.ca"));
    }
}