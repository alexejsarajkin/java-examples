package com.ocp.host.igor.stage3;

import java.io.File;
import java.io.IOException;

public class Problem48 {

    public static void main(String[] args) {

    }

    public void erase(String dirName) throws IOException {
        File[] listOfFiles = new File(dirName).listFiles();
        if (listOfFiles != null && listOfFiles.length > 0) {
            for (File aFile : listOfFiles) {
                if (aFile.isDirectory()) {
                    erase(aFile.getAbsolutePath());
                } else {
                    if (aFile.getName().endsWith(".txt"))
                        aFile.delete();
                }
            }
        }
    }
}
