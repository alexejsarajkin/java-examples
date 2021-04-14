package com.ocp.book.oracle.writer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer2 {
    public static void main(String[] args) throws IOException {
        File file = new File("FileWriter2.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("howdy\nfolks\n");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(file);
        char[] in = new char[12];
        int size = fr.read(in);
        System.out.println(size);

        for (char c : in)
            System.out.print(c);

        fr.close();
    }
}
