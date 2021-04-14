package com.ocp.host.igor.stage3;

public class Problem80 {
    public static void main(String[] args) {
        int followers = 0;
        String subject = "Programming Languages";
        switch (subject) {
            case "Java":
                followers = 3;
                break;
            case "Nairi":
                followers = 0;
                break;
            default:
                assert false : "Start another blog";        // line n1
        }
        System.out.println("Currently " + followers + " followers");
    }
}
