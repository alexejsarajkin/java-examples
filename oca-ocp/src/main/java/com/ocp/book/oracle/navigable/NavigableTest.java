package com.ocp.book.oracle.navigable;

import java.util.TreeSet;

public class NavigableTest {
    public static void main(String[] args) {
        TreeSet<Integer> times = new TreeSet<>();
        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);
        System.out.println("lower " + times.lower(1545));
        System.out.println("floor " + times.floor(1545));
        System.out.println("higher " + times.higher(1545));
        System.out.println("ceiling " + times.ceiling(1545));
    }
}
