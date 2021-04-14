package com.oca;

public class Zeta {
    public static void main(String[] args) {
        int x = 1;
        if ((4 > x) ^ ((++x + 2) > 3)) {
            x++;
        }
        if ((4 > ++x) ^ !(++x == 5)) {
            x++;
        }
        System.out.println(x);
    }
}
