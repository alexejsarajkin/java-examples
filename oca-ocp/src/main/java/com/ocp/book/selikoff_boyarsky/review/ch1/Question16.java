package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Question16 {
    class Inner {
        public Inner() {
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        new Question16().doStuff();
    }

    private void doStuff() {
        Inner in1 = new Inner();
        Question16.Inner in3 = new Question16.Inner();
        Question16.Inner in5 = new Question16().new Inner();
    }
}
