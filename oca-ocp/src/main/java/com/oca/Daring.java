package com.oca;

public class Daring {
    static void jumper() {
        try {
//      throw new Exception();
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        try {
            jumper();
        } catch (Exception e) {
            System.out.println("jump exc");
        }
    }
}
