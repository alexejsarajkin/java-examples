package com.ocp.book.oracle.inner_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Popcorn p = new Popcorn() {
            @Override
            public void pop() {
                System.out.println("anonymous popcorn");
                sizzle();
            }

            public void sizzle() {
                System.out.println("anonymous sizzle");
            }
        };

        p.pop();
        p.pop1();
//		p.sizzle(); Not Legal!

        Cookable c = new Cookable() {
            @Override
            public void cook() {
                System.out.println("anonymous cookable");
            }
        };

        c.cook();
    }
}

class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }

    public void pop1() {
        System.out.println("popcorn 1");
    }
}

interface Cookable {
    void cook();
}
