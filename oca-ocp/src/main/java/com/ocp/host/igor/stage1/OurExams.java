package com.ocp.host.igor.stage1;

public class OurExams {
    public static void main(String[] args) {
        String exams = "1Z0-808 & 1Z0-809    C8";
        exams.replaceAll("[C8]", "Z");
        for (String e : exams.split("-")) {
            System.out.print(e.indexOf("Z") + " ");
        }
    }
}
