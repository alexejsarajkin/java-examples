package com.ocp.book.selikoff_boyarsky.practice_tests.chapter12;

public class Question7 {
    private int level = 1;

    class Deep {
        private int level = 2;

        class Deeper {
            private int level = 5;

            public void printReality() {
                System.out.print(level);
                System.out.print(" " + Question7.Deep.this.level);
                System.out.print(" " + Deep.this.level);
            }
        }
    }

    public static void main(String[] bots) {
        Question7.Deep.Deeper simulation = new Question7().new Deep().new Deeper();
        simulation.printReality();
    }
}
