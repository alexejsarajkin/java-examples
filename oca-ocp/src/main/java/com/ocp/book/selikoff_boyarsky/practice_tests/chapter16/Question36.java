package com.ocp.book.selikoff_boyarsky.practice_tests.chapter16;

public class Question36 {
}

class OutOfTuneException extends Exception {
    OutOfTuneException(String message) {
        super(message);
    }
}

// class Piano {
//    public void play() throws OutOfTuneException, FileNotFoundException {
//        throw new OutOfTuneException("Sour note!");
//    }
//
//    public static void main(String... keys) throws OutOfTuneException {
//        final Piano piano = new Piano();
//        try {
//            piano.play();
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            System.out.println("Song finished!");
//        }
//    }
//}
