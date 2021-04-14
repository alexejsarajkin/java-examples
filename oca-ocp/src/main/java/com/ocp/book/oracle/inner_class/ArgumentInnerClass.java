package com.ocp.book.oracle.inner_class;

public class ArgumentInnerClass {
    public static void main(String[] args) {
        ArgumentInnerClass aic = new ArgumentInnerClass();
        aic.go();
    }

    void go() {
        Bar b = new Bar();
        b.doStuff(new Foo() {
            @Override
            public void foof() {
                System.out.println("foof");
            }
        });

        // Lambda
        b.doStuff(() -> System.out.println("foof lambda"));

        Foo f = () -> {
            System.out.println("foof lambda 1");
            System.out.println("foof lambda 2");
        };
        b.doStuff(f);
    }
}

interface Foo {
    void foof();
}

class Bar {
    void doStuff(Foo f) {
        f.foof();
    }
}
