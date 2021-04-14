package com.ocp.book.selikoff_boyarsky.practice_tests.chapter11;

import java.util.Collection;

public class Question17 {
    public static void main(String[] args) {
        Bus bus = new Bus();

        System.out.println(null instanceof Bus);
        System.out.println(bus instanceof Vehicle);
        System.out.println(bus instanceof Bus);
//        System.out.println(bus instanceof ArrayList);
        System.out.println(bus instanceof Collection);
    }
}

interface Vehicle {
}

class Bus implements Vehicle {
}


