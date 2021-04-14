package com.ocp.book.oracle.self_test.ch6;

import java.util.LinkedHashSet;

public class Q12 {
    public static void main(String[] args) {
        LinkedHashSet<Turtle> t = new LinkedHashSet<>();
        t.add(new Turtle(1));
        t.add(new Turtle(2));
        t.add(new Turtle(1));
        System.out.println(t.size());
    }

    static class Turtle {
        int size;

        public Turtle(int size) {
            this.size = size;
        }

        @Override
        public boolean equals(Object o) {
            return (this.size == ((Turtle) o).size);
        }

        @Override
        public int hashCode() {
            return size / 5;
        }
    }
}

