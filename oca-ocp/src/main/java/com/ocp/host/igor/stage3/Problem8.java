package com.ocp.host.igor.stage3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Problem8 implements Runnable {
    String fileName;

    public Problem8(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println(fileName);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("/users"));
        listOfFiles.forEach(e -> {
            exec.execute(new Problem8(e.getFileName().toString()));          // line n1
        });
        exec.shutdown();
        exec.awaitTermination(365, TimeUnit.DAYS);                       // line n2
    }
}
