package com.oca;

import java.util.Date;

public class CheckGC {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total JVM memory " + runtime.totalMemory());
        System.out.println("Before memory " + runtime.freeMemory());

        Date d = null;
        for (int i = 0; i < 10000; i++) ;
        {
            d = new Date();
            d = null;
        }

        System.out.println("After memory " + runtime.freeMemory());
        runtime.gc();
        System.out.println("After GC memory " + runtime.freeMemory());
    }
}
