package com.ocp.book.selikoff_boyarsky.practice_tests.chapter12;

public class Question38 {
}

interface Toy {
    String play();
}

class Gift {
    public static void main(String[] matrix) {
        abstract class Robot {
        }
        class Transformer extends Robot implements Toy {
            public String name = "GiantRobot";

            public String play() {
                return "DinosaurRobot";
            }
        }
        Transformer prime = new Transformer() {
            public String play() {
                return name;
            } // y1
        };
//        System.out.print(prime.play() + " " + name);
    }
}
