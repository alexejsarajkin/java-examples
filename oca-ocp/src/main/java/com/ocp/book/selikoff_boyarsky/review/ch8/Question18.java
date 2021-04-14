package com.ocp.book.selikoff_boyarsky.review.ch8;

import java.io.Console;

public class Question18 {
    public static void main(String[] args) {
        Console console = System.console();
        String color = console.readLine("What is your favorite color? ");
        console.format("Your favorite color is " + color);
        console.printf("Your favorite color is " + color);
    }
}
