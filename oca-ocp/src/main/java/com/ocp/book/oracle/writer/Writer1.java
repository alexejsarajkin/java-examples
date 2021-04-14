package com.ocp.book.oracle.writer;

import java.io.File;
import java.io.IOException;

public class Writer1 {
    public static void main(String[] args) throws IOException {
        File file = new File("FileWriter1.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
    }
}
