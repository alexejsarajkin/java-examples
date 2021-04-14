package com.ocp.examtopics;

import java.util.concurrent.*;

public class Question13 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(4); //line n1
        Future f1 = es.submit(new CallerThread("Call"));
        String str = f1.get().toString();
        System.out.println(str);
    }
}

class CallerThread implements Callable<String> {
    String str;

    public CallerThread(String s) {
        this.str = s;
    }

    public String call() throws Exception {
        return str.concat("Call ");
    }
}

