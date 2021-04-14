package com.ocp.book.oracle.concurrency;

import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class StatefulLimit {
    static final int SIZE = 400_000_000;
    static final int LIMIT = 5;
    static long sum = 0, startTime, endTime;
    static IntStream stream;
    static ForkJoinPool forkJoinPool;

    public static void main(String[] args) {
        stream = IntStream.range(0, SIZE);
        startTime = Instant.now().toEpochMilli();
        sum = stream
                .limit(LIMIT)
                .sum();
        endTime = Instant.now().toEpochMilli();
        System.out.println("Items summed in " + (endTime - startTime) + " millisecond; sum is: " + sum);

        stream = IntStream.range(0, SIZE);
        startTime = Instant.now().toEpochMilli();
        sum = stream
                .parallel()
                .limit(LIMIT)
                .sum();
        endTime = Instant.now().toEpochMilli();
        System.out.println("Items summed in " + (endTime - startTime) + " millisecond; sum is: " + sum);

        forkJoinPool = new ForkJoinPool();
        try {
            stream = IntStream.range(0, SIZE);
            startTime = Instant.now().toEpochMilli();
            sum = forkJoinPool.submit(
                    () -> stream
                            .limit(LIMIT)
                            .sum()
            ).get();
            endTime = Instant.now().toEpochMilli();
            System.out.println("Items summed in " + (endTime - startTime) + " millisecond; sum is: " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }

        forkJoinPool = new ForkJoinPool(2);
        try {
            stream = IntStream.range(0, SIZE);
            startTime = Instant.now().toEpochMilli();
            sum = forkJoinPool.submit(
                    () -> stream
                            .parallel()
                            .limit(LIMIT)
                            .sum()
            ).get();
            endTime = Instant.now().toEpochMilli();
            System.out.println("Items summed in " + (endTime - startTime) + " millisecond; sum is: " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
