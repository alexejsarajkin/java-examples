package com.ocp.host.igor.stage3;

public class Problem89 {
    public static void main(String[] args) {
        int x = 10;
        int y = -1;
        assert (y >= 1) : "Wrong divisor";
        int z = x / y;
        System.out.println(z);
    }
}
