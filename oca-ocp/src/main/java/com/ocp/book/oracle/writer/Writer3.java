package com.ocp.book.oracle.writer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer3 {
    public static void main(String[] args) throws IOException {
        File file = new File("FileWriter3.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("howdy\nfolks\n".getBytes("UTF-8"));
        fileOutputStream.flush();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] in = new byte[12];
        int size = fileInputStream.read(in);
        System.out.println(size);

        for (byte c : in)
            System.out.print((char) c);

        fileInputStream.close();
    }
}
