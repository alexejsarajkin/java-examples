package com.ocp.book.selikoff_boyarsky.practice_tests.chapter16;

public class Question3 {
}

class LostBallException extends Exception {
}

class Ball {
    public void toss() throws LostBallException {
        throw new ArrayStoreException();
    }

    public static void main(String[] bouncy) {
        try {
            new Ball().toss();
        } catch (Throwable e) {
            System.out.print("Caught!");
        }
    }
}
