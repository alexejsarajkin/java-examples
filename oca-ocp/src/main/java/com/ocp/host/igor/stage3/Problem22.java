package com.ocp.host.igor.stage3;

import java.util.concurrent.*;

public class Problem22 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec = Executors.newFixedThreadPool(3); //line n1
        Future fut = exec.submit(new GirlFriend("Call her!"));
        String str = fut.get().toString();
        System.out.println(str);
    }
}

class GirlFriend implements Callable<String> {
    String str;

    public GirlFriend(String str) {
        this.str = str;
    }

    public String call() throws Exception {
        return str.concat(" Call her!");
    }
}