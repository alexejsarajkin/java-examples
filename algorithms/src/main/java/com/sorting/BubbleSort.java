package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 99, 45, 74, 24, 79, 3, 13, 56, 89, 53};
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    isSorted = false;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
