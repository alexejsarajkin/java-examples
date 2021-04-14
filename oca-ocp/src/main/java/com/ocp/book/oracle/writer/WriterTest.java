package com.ocp.book.oracle.writer;

import java.io.*;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("FileWriter2.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line + "\n");
        }

        File myDir = new File("myDir");
        myDir.mkdir();

        File myFile = new File(myDir, "myFile.txt");
        myFile.createNewFile();

        PrintWriter pw = new PrintWriter(myFile);
        pw.println("new stuff");
        pw.flush();
        pw.close();

    }


}
