package com.oca;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bandit {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.now();
        LocalDate d1 = LocalDate.now();
        if (t1.equals(d1)) {
            System.out.println("equals ");
        }
//    if(t1.isBefore(d1)){
//      System.out.println("before ");
//    }
        if (t2.isAfter(t1)) {
            System.out.println("after ");
        }
    }
}
