package com.ocp.book.oracle.concurrency;

import java.util.stream.IntStream;

public class Stateful {
    static class Count {
        int counter = 0;
    }

    public static void main(String[] args) {
        Count count = new Count();
        IntStream stream = IntStream.range(0, 50);
        int sum = stream
                .parallel()
                .filter(e -> {
                    if (e % 10 == 0) {
                        count.counter++;
                        return true;
                    }
                    return false;
                }).sum();
        System.out.println(sum + " : " + count.counter);
    }
}
