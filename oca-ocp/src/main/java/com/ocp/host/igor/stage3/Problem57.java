package com.ocp.host.igor.stage3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem57 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/app/./sys/");
        Path res1 = path1.resolve("log");
        Path path2 = Paths.get("/server/exe/");
        Path res2 = path2.resolve("/readme/");
        System.out.println(res1);
        System.out.println(res2);

        Path p1 = Paths.get("/usr/./bin/");
        Path r1 = p1.resolve("python");
        Path p2 = Paths.get("/var/lib/");
        Path r2 = p2.resolve("/home/");
        System.out.println(r1);
        System.out.println(r2);
    }
}
