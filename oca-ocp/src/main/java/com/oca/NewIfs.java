package com.oca;

interface TestIf {
    default String m1() {
        return "m1";
    }

    static String m2() {
        return "m2";
    }

    public String m3();
}

public class NewIfs implements TestIf {
    @Override
    public String m3() {
        return "m3";
    }

    public static void main(String[] args) {
        NewIfs n = new NewIfs();
        System.out.println(n.m1());
//    System.out.println(n.m2);
        System.out.println(TestIf.m2());
        System.out.println(n.m3());
    }
}
