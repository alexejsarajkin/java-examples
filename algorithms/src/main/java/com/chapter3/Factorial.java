package com.chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Factorial {

    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return number;
        }

        return number * factorial(number - 1);
    }

    @Test
    public void binarySearchTest() {
        assertEquals(factorial(0), 0);
        assertEquals(factorial(1), 1);
        assertEquals(factorial(2), 2);
        assertEquals(factorial(3), 6);
        assertEquals(factorial(4), 24);
        assertEquals(factorial(5), 120);
    }
}
