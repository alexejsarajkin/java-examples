package com.concurrency.executors;

import com.concurrency.threadslesson.ColorScheme;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;


public class Launcher {
    private static final int POOL_SIZE = 2;

    public static void main(String[] args) throws InterruptedException {
        boolean isDaemon = true;

        System.out.println(ColorScheme.RED + "Starting main thread");
        GCDRunnable r = new GCDRunnable(isDaemon);
//        runInOneThread(r, isDaemon);
        runWithExecutors(r, isDaemon);
        System.out.println(ColorScheme.RED + "Leaving the main thread");


    }

    private static void runInOneThread(GCDRunnable r, boolean isDaemon) throws InterruptedException {
        Thread th = new Thread(r);
        if (isDaemon) {
            th.setDaemon(true);
        }
        th.start();
//        th.interrupt();

    }

    private static void runWithExecutors(GCDRunnable r, boolean isDaemon) throws InterruptedException {

        ThreadFactory factory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                if (isDaemon) {
                    thread.setDaemon(true);
                }
                return thread;
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(POOL_SIZE, factory);
        for (int i = 0; i < 5; i++) {
            executorService.execute(r);
        }
        executorService.shutdown();

        executorService.awaitTermination(30, TimeUnit.SECONDS);
    }


}
