package com.ocp.examtopics;

import java.io.Console;

public class Question107 {
    public static void main(String[] args) {
        Console console = System.console();
        char[] pass = console.readPassword("Enter password:");
        String password = new String(pass);
    }
}

// The code reads the password without echoing characters on the console.
