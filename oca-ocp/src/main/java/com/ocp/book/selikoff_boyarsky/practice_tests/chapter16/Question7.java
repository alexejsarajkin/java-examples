package com.ocp.book.selikoff_boyarsky.practice_tests.chapter16;

public class Question7 {
}

class WhaleSharkException extends Exception {
    public WhaleSharkException() {
        super("Friendly shark!");
    }

    public WhaleSharkException(String message) {
        super(new Exception(new WhaleSharkException()));
    }

    public WhaleSharkException(Exception cause) {
    }
}
