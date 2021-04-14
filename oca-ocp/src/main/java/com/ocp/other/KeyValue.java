package com.ocp.other;

import java.util.Locale;
import java.util.ResourceBundle;

public class KeyValue {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("com.ocp.other.Bundle", Locale.getDefault());
        System.out.println(rb.getObject("123"));
        System.out.println(rb.getString("123"));
    }
}
