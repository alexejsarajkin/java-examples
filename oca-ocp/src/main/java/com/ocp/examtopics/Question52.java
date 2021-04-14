package com.ocp.examtopics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question52 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter GDP: ");
        int GDP = Integer.parseInt(br.readLine());
    }
}
