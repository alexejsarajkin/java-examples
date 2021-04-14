package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Question9 {
    private int x = 24;

    public int getX() {
        String message = "x is ";

        class Inner {
            private int x = Question9.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new Question9().getX();
    }
}
