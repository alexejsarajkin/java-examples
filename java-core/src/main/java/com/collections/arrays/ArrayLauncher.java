package com.collections.arrays;

import java.util.Scanner;

public class ArrayLauncher {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Element #" + i + " = " + myArray[i]);
//        }

//        for (int a : myArray) {
//            System.out.println(a);
//        }

        int[] myArray = new int[8];

        System.out.println("Enter 8 int element");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Next element");
            myArray[i] = scanner.nextInt();
        }

        int[] array = sort(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element #" + i + " = " + myArray[i]);
        }

    }

    private static int[] sort(int[] array) {
//        int myNewArray[] = Arrays.copyOf(array, array.length); // Копирование массива

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
