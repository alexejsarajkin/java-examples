package com.oca;

public class Casting {
    public static void main(String[] args) {
        long l = 130L;
        byte b = (byte) l;
        System.out.println(b + " " + String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));

        b = (byte) 128;
        System.out.println(b + " " + String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));

        int i = (int) 123.456;
        System.out.println(i);

        float f = 234.56F;
        short s = (short) f;
        System.out.println(s);
    }
}
