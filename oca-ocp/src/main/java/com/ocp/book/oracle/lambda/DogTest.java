package com.ocp.book.oracle.lambda;

public class DogTest {
    public static void main(String[] args) {
        Dog boi = new Dog("boi", 30, 6);
        Dog clover = new Dog("clover", 35, 12);

        DogQuerier dq = d -> d.getAge() > 9;
        System.out.println("boi " + dq.test(boi));
        System.out.println("clover " + dq.test(clover));

        DogPlay dpBoi = new DogPlay(d -> d.getAge() > 9);
        System.out.println(dpBoi.doQuery(boi));

        int numCats = 3;

        DogQuerier dqWithCats = d -> {
            int numBalls = 1;
            numBalls++;
            System.out.println(numBalls);
            System.out.println(numCats);
            return d.getAge() > 9;
        };

        DogPlay dpClover = new DogPlay(dqWithCats);
        System.out.println(dpClover.doQuery(clover));
    }
}
