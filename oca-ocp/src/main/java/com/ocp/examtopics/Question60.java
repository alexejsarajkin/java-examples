package com.ocp.examtopics;

import java.io.File;
import java.io.IOException;

public class Question60 {
    public static void main(String[] args) {
//        Stream<String> fc = Files.lines (file);
//        fc.forEach (s -> System.out.println(s));
    }

    public void recDelete(String dirName) throws IOException {
        File[] listOfFiles = new File(dirName).listFiles();
        if (listOfFiles != null && listOfFiles.length > 0) {
            for (File aFile : listOfFiles) {
                if (aFile.isDirectory()) {
                    recDelete(aFile.getAbsolutePath());
                } else {
                    if (aFile.getName().endsWith(".class"))
                        aFile.delete();
                }
            }
        }
    }
}
