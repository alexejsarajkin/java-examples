package com.ocp.book.selikoff_boyarsky.practice_tests.chapter16;

public class Question20 {
}

class DataIntegrity {
    private int score;

    public DataIntegrity() {
        super();
        DataIntegrity.this.score = 5;
    }

    public static void main(String[] books) {
        final DataIntegrity johnny5 = new DataIntegrity();
        assert (johnny5.score > 2) : johnny5.score++;
//        assert johnny5.score >= 5 : System.out.print("No input");
        System.out.print("Made it!");
    }
}
