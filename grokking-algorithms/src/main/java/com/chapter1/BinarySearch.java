package com.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearch {

    public static int binarySearch(int[] list, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == list[middle]) {
            return middle;
        } else if (key < list[middle]) {
            return binarySearch(list, key, low, middle - 1);
        } else {
            return binarySearch(list, key, middle + 1, high);
        }
    }

    @Test
    public void binarySearchTest() {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(binarySearch(list, 1, 0, list.length - 1), 0);
        assertEquals(binarySearch(list, 2, 0, list.length - 1), 1);
        assertEquals(binarySearch(list, 3, 0, list.length - 1), 2);
        assertEquals(binarySearch(list, 4, 0, list.length - 1), 3);
        assertEquals(binarySearch(list, 5, 0, list.length - 1), 4);
        assertEquals(binarySearch(list, 6, 0, list.length - 1), 5);
        assertEquals(binarySearch(list, 7, 0, list.length - 1), 6);
        assertEquals(binarySearch(list, 8, 0, list.length - 1), 7);
        assertEquals(binarySearch(list, 9, 0, list.length - 1), 8);
        assertEquals(binarySearch(list, 10, 0, list.length - 1), 9);

        assertEquals(binarySearch(list, -1, 0, list.length - 1), -1);
        assertEquals(binarySearch(list, 11, 0, list.length - 1), -1);

    }
}
