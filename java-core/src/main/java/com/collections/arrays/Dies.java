package com.collections.arrays;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];

        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }

        for (int i = 1; i < frequency.length; i++) {
            System.out.println("Side # " + i + " = " + frequency[i]);
        }

        System.out.println("-----------------------------");

        for (int i : frequency) {
            System.out.println("Side # " + i);
        }

        System.out.println("-----------------------------");

        multidimArrayLauncher();
    }

    private static void multidimArrayLauncher() {
        int[][] arrayA = {{324, 23}, {4, 234, 45, 74}, {24, 84, 35}};

        int[][] arrayB = new int[3][3];

        int[][] arrayC = new int[2][];
        arrayC[0] = new int[2];
        arrayC[1] = new int[4];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }
    }
}
