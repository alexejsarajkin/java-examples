package com.oca;

class CastleUnderSiegeException extends Exception {
}

class KnightAttackingException extends CastleUnderSiegeException {
}

public class Citadel {
    public void openDrawbridge() throws RuntimeException {

        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            throw new ClassCastException();
        } finally {
//      throw new CastleUnderSiegeException();
        }
    }

    public static void main(String[] moat) {
        new Citadel().openDrawbridge();
    }
}
