package com.ocp.host.igor.stage3;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Problem88 {
    public static void main(String[] args) {
        int i;
        char c;
        try (FileInputStream fis = new FileInputStream("test.txt");
             InputStreamReader isr = new InputStreamReader(fis);) {
            while (isr.ready()) { //line n1
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
