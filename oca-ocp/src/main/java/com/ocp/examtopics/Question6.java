package com.ocp.examtopics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) { // line n1
            br.lines().forEach(c -> System.out.println(c));
            brCopy = br; // line n2
        }
        brCopy.ready(); // line n3;
    }
}
