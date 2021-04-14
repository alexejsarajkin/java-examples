package com.ocp.book.oracle.concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FindMaxPositionRecursiveAction extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 10000;
    private int[] data;
    private int start;
    private int end;

    public FindMaxPositionRecursiveAction(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            System.out.println("Compute if: " + Thread.currentThread().getName());
            int position = 0;
            for (int i = start; i < end; i++) {
                if (data[i] > data[position]) {
                    position = i;
                }
            }
            return position;
        } else {
            System.out.println("Compute else: " + Thread.currentThread().getName());
            int halfWay = ((end - start) / 2) + start;
            FindMaxPositionRecursiveAction a1 = new FindMaxPositionRecursiveAction(data, start, halfWay);
            a1.fork();
            FindMaxPositionRecursiveAction a2 = new FindMaxPositionRecursiveAction(data, halfWay, end);
            int position2 = a2.compute();
            int position1 = a1.join();
            if (data[position1] > data[position2]) {
                return position1;
            } else if (data[position1] < data[position2]) {
                return position2;
            } else {
                return Math.min(position1, position2);
            }
        }
    }

    public static void main(String[] args) {
        int[] data = new int[10_000_000];
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 0, data.length);
        forkJoinPool.invoke(action);

        FindMaxPositionRecursiveAction task = new FindMaxPositionRecursiveAction(data, 0, data.length);
        Integer position = forkJoinPool.invoke(task);
        System.out.println("Position: " + position + ", value: " + data[position]);
    }
}
