package com.oca;

public class Propagate {
    public static void main(String[] args) {
        try {
            System.out.println(reverse(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String reverse(String s) throws Exception {
        if (s.length() == 0) {
            throw new Exception("test");
        }

        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }

        return reverseStr;
    }
}
