package com.oca;

public class MyProgram1 {
    public static void throwIt() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Hello world ");
            throwIt();
            System.out.println("Done ");
        } finally {
            System.out.println("Final");
        }
    }
}
