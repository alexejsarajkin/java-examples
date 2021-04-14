package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Question8 {

    private int x = 5;

    protected class Inner {
//		public static int x = 10;

        public void go() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Question8 out = new Question8();
        Question8.Inner in = out.new Inner();
        in.go();
    }
}
