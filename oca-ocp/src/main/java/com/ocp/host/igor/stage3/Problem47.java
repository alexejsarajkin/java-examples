package com.ocp.host.igor.stage3;


public class Problem47 {
    static class Catcher {
        static void calculate(int[] num) {
            try {
                System.out.println(num[1] / (num[1] - num[2]));
            } catch (ArithmeticException ae) {
                System.err.println("First one caught");
            }
        }

        public static void main(String[] args) {
            try {
                int[] arr = {100, 100};
                calculate(arr);
            } catch (IllegalArgumentException iae) {
                System.err.println("Second one caught");
            } catch (Exception e) {
                System.err.println("Third one caught");
            }
        }
    }
}