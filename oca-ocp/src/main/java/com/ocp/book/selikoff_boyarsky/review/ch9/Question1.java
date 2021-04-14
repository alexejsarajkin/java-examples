package com.ocp.book.selikoff_boyarsky.review.ch9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question1 {
    public static void main(String[] args) {
        Path path = Paths.get("/user/.././root", "../kodiacbear.txt");
        path.normalize().relativize(Paths.get("/lion"));
        System.out.println(path);
    }
}
