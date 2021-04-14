package com.ocp.book.oracle.concurrency;

import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class SumRecursiveTask extends RecursiveTask<Long> {
    public static final int SIZE = 400_000_000;
    public static final int THRESHOLD = 1000;
    public static final int MAX = 10;
    public static final int NUM = 50;
    private int[] data;
    private int start;
    private int end;

    public SumRecursiveTask(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long tempSum = 0;
        if (end - start <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                if (data[i] > NUM) {
                    tempSum += data[i];
                }
            }
            return tempSum;
        } else {
            int halfWay = ((end - start) / 2) + start;
            SumRecursiveTask t1 = new SumRecursiveTask(data, start, halfWay);
            SumRecursiveTask t2 = new SumRecursiveTask(data, halfWay, end);
            t1.fork();
            long sum2 = t2.compute();
            long sum1 = t1.join();
            return sum1 + sum2;
        }
    }

    public static void main(String[] args) {
        int[] data2sum = new int[SIZE];
        long sum = 0, startTime, endTime, duration;

        for (int i = 0; i < SIZE; i++) {
            data2sum[i] = ThreadLocalRandom.current().nextInt(MAX) + 1;
        }

        startTime = Instant.now().toEpochMilli();
        for (int i = 0; i < data2sum.length; i++) {
            if (data2sum[i] > NUM) {
                sum = sum + data2sum[i];
            }
        }
        endTime = Instant.now().toEpochMilli();
        duration = endTime - startTime;
        System.out.println("Summed with for loop in " + duration + " milliseconds; sum is: " + sum);

        ForkJoinPool fjp = new ForkJoinPool();
        SumRecursiveTask action = new SumRecursiveTask(data2sum, 0, data2sum.length);
        startTime = Instant.now().toEpochMilli();
        sum = fjp.invoke(action);
        endTime = Instant.now().toEpochMilli();
        duration = endTime - startTime;
        System.out.println("Summed with recursive task " + duration + " milliseconds; sum is: " + sum);

        IntStream intStream = IntStream.of(data2sum);
        startTime = Instant.now().toEpochMilli();
        sum = intStream
                .unordered()
                .parallel()
                .filter(i -> i > NUM)
                .sum();
        endTime = Instant.now().toEpochMilli();
        duration = endTime - startTime;
        System.out.println("Summed with stream " + duration + " milliseconds; sum is: " + sum);

        ForkJoinPool forkJoinPool2 = new ForkJoinPool(4);
        IntStream intStream2 = IntStream.of(data2sum);
        try {
            startTime = Instant.now().toEpochMilli();
            sum = forkJoinPool2.submit(() -> intStream2
                    .unordered()
                    .parallel()
                    .filter(i -> i > NUM)
                    .sum()).get();
            endTime = Instant.now().toEpochMilli();
            duration = endTime - startTime;
            System.out.println("Summed with forkJoinPool + stream " + duration + " milliseconds; sum is: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
