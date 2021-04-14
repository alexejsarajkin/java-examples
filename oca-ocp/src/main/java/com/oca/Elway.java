package com.oca;

public class Elway {
    public static void main(String[] a) {
        if (a.length == 0) System.exit(0);
        try {
            final int x = Integer.parseInt(a[0]);
            final int y = new Elway().go(x);
//      System.out.println(go(y));

        } catch (Exception e) {
            System.out.println("parse");
        }
    }

    int go(int z) {
        return z++;
    }
}
