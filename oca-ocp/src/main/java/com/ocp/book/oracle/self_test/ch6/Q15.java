package com.ocp.book.oracle.self_test.ch6;

import java.util.TreeSet;

public class Q15 {
    public static void main(String[] args) {
        TreeSet<Integer> i = new TreeSet<>();
        TreeSet<Dog> d = new TreeSet<>();

        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));

        i.add(1);
        i.add(2);
        i.add(1);
        System.out.println(d.size() + " " + i.size());
    }

    static class Dog {
        int size;

        public Dog(int size) {
            this.size = size;
        }
    }
}

