package com.collections.arrays;

import java.util.Arrays;

public class GradeBook {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {34, 52, 85},
                {23, 41, 64},
                {100, 81, 82}};

        System.out.println("Minimal grade " + calcMin(gradesArray));

        varArgs();

        processArrays();
    }

    private static int calcMin(int[][] grades) {
        int min = 100;

        for (int[] row : grades) {
            for (int i : row) {
                if (min > i) {
                    min = i;
                }
            }

        }
        return min;
    }

    private static void varArgs() {
        double a = 0.56;
        double b = 1.92;
        double c = 3.45;
        double d = 5.01;

        System.out.println("Average of 2 elements is " + calcAverage(a, b));
        System.out.println("Average of 3 elements is " + calcAverage(a, b, c));
        System.out.println("Average of 4 elements is " + calcAverage(a, b, c, d));
    }

    private static double calcAverage(double... arg) {
        double sum = 0;

        for (double i : arg) {
            sum = sum + i;
        }

        return sum / arg.length;
    }

    private static void processArrays() {
        double[] doubleArray = {8.9, 5.65, 8.12, 45.0, 77.1};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));

        int[] filledArray = new int[7];
        Arrays.fill(filledArray, 7);
        System.out.println(Arrays.toString(filledArray));

        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayCopy = new int[10];

        System.arraycopy(intArray, 0, arrayCopy, 0, intArray.length);

        System.out.println(Arrays.toString(arrayCopy));
    }
}
