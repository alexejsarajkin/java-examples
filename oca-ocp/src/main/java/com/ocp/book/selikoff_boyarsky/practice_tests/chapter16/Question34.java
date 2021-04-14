package com.ocp.book.selikoff_boyarsky.practice_tests.chapter16;

public class Question34 {
}

class MissedCallException extends Exception {
}

class Phone {
    static void makeCall() throws RuntimeException {
        throw new ArrayIndexOutOfBoundsException("Call");
    }

    public static void main(String[] messages) {
        try {
            makeCall();
//        } catch (MissedCallException e) {
//            throw new RuntimeException("Voicemail");
        } finally {
            throw new RuntimeException("Text");
        }
    }
}
