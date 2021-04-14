package com.ocp.book.selikoff_boyarsky.review.ch1;

public class Question18 {
    enum AnimalClasses {
        MAMMAL, FISH {
            public boolean hasFins() {
                return true;
            }
        },
        BIRD, REPTILE, AMPHIBIAN, INVERTEBRATE;

        public boolean hasFins() {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(AnimalClasses.FISH);
        System.out.println(AnimalClasses.FISH.ordinal());
        System.out.println(AnimalClasses.FISH.hasFins());
        System.out.println(AnimalClasses.BIRD.hasFins());
    }
}
