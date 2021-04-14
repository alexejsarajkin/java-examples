package com.ocp.host.igor.stage1;

public class Wrapper {
    public static void main(String[] args) {
        Double d = 10.0;
        Long l = 10L;
        Integer i = 10;
        System.out.println(d.equals(i));
        System.out.println(l.equals(i));
        System.out.println(l.equals(d));
    }
}
