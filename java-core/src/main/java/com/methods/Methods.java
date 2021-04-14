package com.methods;

public class Methods {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int rectangleSquare = calcRectangleSquare(a, b);
        int square = calcSquare(b);
        printMessage("Rectangle square = " + rectangleSquare);
        printMessage("Square = " + square);
    }

    private static void printMessage(String str) {
        System.out.println(str);
    }

    private static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    private static int calcSquare(int x) {
        return x * x;
    }
}
