package com.controlstatement;

public class Controls {

    public static void main(String[] args) {

        int i = 10;

        {
            int k = 15;
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }

        int testScore = 95;

        if (testScore >= 90) {
            System.out.println("Excellent");
        } else {
            System.out.println("Bad mark");
        }
    }
}
