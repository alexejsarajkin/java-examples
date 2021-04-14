package com.oca;

public class OompahLoompah {
    public static void main(String[] args) {
        final StringBuilder str = new StringBuilder("I good! ");
        str.insert(2, "look ").append("and nice");
        System.out.println(str);
        System.out.println(str.length());
        str.insert(str.length(), "!!!");
        System.out.println(str);
        System.out.println(str.length() - 2);
        str.delete(str.length() - 2, str.length());
        System.out.println(str.toString().trim());

        StringBuilder s = new StringBuilder("test");
        System.out.println(s.length() - 2);
        s.delete(s.length() - 2, s.length());
        System.out.println(s);
    }
}
