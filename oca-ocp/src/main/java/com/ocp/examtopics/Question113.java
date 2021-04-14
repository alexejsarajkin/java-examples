package com.ocp.examtopics;

import java.util.concurrent.*;

public class Question113 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new R());
        Future<String> future = executorService.submit(new C());
        System.out.println(future.get());
        executorService.shutdown();
    }
}

class R implements Runnable {
    public void run() {
        System.out.println("Run...");
    }
}

class C implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Call...";
    }
}

// Run... Call...
