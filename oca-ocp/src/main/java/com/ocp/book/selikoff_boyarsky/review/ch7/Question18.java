package com.ocp.book.selikoff_boyarsky.review.ch7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Question18 {
    public static void await(CyclicBarrier cb) { // j1
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(10,
                () -> System.out.println("Stock Room Full!"));
        IntStream.iterate(1, i -> 1)
                .limit(11)
                .parallel()
                .forEach(i -> await(cb));
    }
}
