package com.ocp.book.selikoff_boyarsky.practice_tests.chapter16;

public class Question13 {
}

class SpellingException extends RuntimeException {
}

class SpellChecker {
    public final static void main(String... participants) {
        try {
            if (!"cat".equals("kat")) {
                new SpellingException();
            }
        } catch (SpellingException | NullPointerException e) {
            System.out.println("Spelling problem!");
        } catch (Exception e) {
            System.out.println("Unknown Problem!");
        } finally {
            System.out.println("Done!");
        }
    }
}
