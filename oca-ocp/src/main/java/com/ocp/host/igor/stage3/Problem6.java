package com.ocp.host.igor.stage3;

import java.util.concurrent.*;


public class Problem6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Future f1 = exec.submit(new Caller("Call "));
        Future f2 = exec.submit(new Runner("Run "));
        String str1 = (String) f1.get();
        String str2 = (String) f2.get();
//		exec.shutdown();
        System.out.println(str1 + " : " + str2);
        exec.shutdown();
    }

    static class Caller implements Callable<String> {
        String str;

        public Caller(String str) {
            this.str = str;
        }

        public String call() throws Exception {
            return str.concat("Caller");
        }
    }

    static class Runner implements Runnable {
        String str;

        public Runner(String str) {
            this.str = str;
        }

        public void run() {
            System.out.println(str.concat("Runner"));
        }


    }
}
