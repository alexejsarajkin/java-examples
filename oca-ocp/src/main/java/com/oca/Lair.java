package com.oca;

class DragonException extends Exception {
}

public class Lair {
    public void openDrawbridge() throws Exception {
        try {
            throw new Exception("This Exception");
        } catch (RuntimeException e) {
            throw new DragonException();
        } finally {
            throw new RuntimeException("Or maybe this one");
        }
    }

    public static void main(String[] moat) throws Exception {
        new Lair().openDrawbridge();
    }
}
