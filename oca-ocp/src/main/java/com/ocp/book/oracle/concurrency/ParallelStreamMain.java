package com.ocp.book.oracle.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.ForkJoinPool;

public class ParallelStreamMain {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = nums.stream()
                .unordered() // Give more performance
                .parallel()
                .peek(e -> System.out.println(e + " - " + Thread.currentThread().getName()))
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

        System.out.println("--------------------------");

        ForkJoinPool forkJoinPool = new ForkJoinPool(2);
        try {
            int sum2 = forkJoinPool.submit(
                    () -> nums.stream()
                            .parallel()
                            .peek(e -> System.out.println(e + " - " + Thread.currentThread().getName()))
                            .mapToInt(n -> n)
                            .sum()
            ).get();
            System.out.println(sum2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------");

        int sum3 = nums
                .parallelStream()
                .peek(e -> System.out.println(e + " - " + Thread.currentThread().getName()))
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum3);

        System.out.println("--------------------------");

        OptionalDouble avgBad = nums
                .parallelStream()
                .peek(e -> System.out.println(e + " - " + Thread.currentThread().getName()))
                .mapToDouble(n -> n)
                .reduce((d1, d2) -> (d1 + d2) / 2);

        avgBad.ifPresent(a -> System.out.println(a));

        OptionalDouble avg = nums
                .parallelStream()
                .peek(e -> System.out.println(e + " - " + Thread.currentThread().getName()))
                .mapToDouble(n -> n)
                .average();

        avg.ifPresent(a -> System.out.println(a));

        System.out.println("--------------------------");

        int mult = nums.stream()
                .unordered()
                .parallel()
                .reduce(1, (i1, i2) -> i1 * i2);
        System.out.println(mult);

        System.out.println("--------------------------");
    }
}
