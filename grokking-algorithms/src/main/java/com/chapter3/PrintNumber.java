package com.chapter3;

public class PrintNumber {
    public static void main(String[] args) {
        printNumber(100);
    }

    public static void printNumber(int number) {
        System.out.println(number);
        if (number == 0) {
            return;
        }
        printNumber(--number);
    }
}
