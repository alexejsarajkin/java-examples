package com.ocp.other;

public class WrapperTest {
    public static void main(String[] args) {
        Integer y = 567;
        Integer x = y;

        System.out.println(y == x);
        y++;
        System.out.println(x + " " + y);
        System.out.println(y == x);


        Integer i1 = 1000;
        Integer i2 = 1000;

        System.out.println("1000 " + (i1 == i2));
        System.out.println("1000 " + (i1 != i2));
        System.out.println("1000 " + i1.equals(i2));


        Integer i3 = 10;
        Integer i4 = 10;

        System.out.println("10 " + (i3 == i4));
        System.out.println("10 " + (i3 != i4));
        System.out.println("10 " + i3.equals(i4));
    }
}
