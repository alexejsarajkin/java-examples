package com.ocp.examtopics;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question86 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/software/././sys/readme.txt");
        Path path2 = path1.normalize();
        Path path3 = path2.relativize(path1);
        System.out.println(path1.getNameCount());
        System.out.println(path2.getNameCount());
        System.out.println(path3.getNameCount());
    }
}
