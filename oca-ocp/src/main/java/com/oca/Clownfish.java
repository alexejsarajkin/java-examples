package com.oca;

class BubbleException extends Exception {
}

class Fish1 {
    Fish1 getFish() throws BubbleException {
        throw new RuntimeException("fish!");
    }
}

public final class Clownfish extends Fish1 {
    public final Clownfish getFish() {
        throw new RuntimeException("clown!");
    }

    public static void main(String[] bubbles) {
        final Fish1 f = new Clownfish();

//    f.getFish();
        System.out.println("swim!");
    }
}
