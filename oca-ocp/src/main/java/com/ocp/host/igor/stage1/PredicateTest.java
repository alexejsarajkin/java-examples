package com.ocp.host.igor.stage1;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateTest {
    String greeting = "Hello!";
    Predicate<String> pred = x -> x.isEmpty();   // semicolon ain't part of LE
    Consumer<String> cons = x -> System.out.println(x);
    Supplier<String> supp = () -> "Hi there!";

    boolean check(String str, Predicate<String> pred) {
        return pred.test(str);
    }

    void consume(String str, Consumer<String> cons) {
        cons.accept(str);
    }

    String supply(Supplier<String> supp) {
        return supp.get();
    }

    void run() {
        check(greeting, x -> x.isEmpty());    // no semicolon after SINGLE statement allowed
        consume(greeting, x -> System.out.println(x));
        supply(() -> "Salut!");
    }

    public static void main(String[] args) {
        new Test().run();                                    // Hello!
    }
}
