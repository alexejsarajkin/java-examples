package com.ocp.book.oracle.lambda;

@FunctionalInterface
public interface DogQuerier {
    boolean test(Dog d);
}
