package com.ocp.examtopics;

import java.time.Instant;

import static java.time.temporal.ChronoUnit.MINUTES;

public class Question118 {
    public static void main(String[] args) throws InterruptedException {
        Instant loginTime = Instant.now();
        Thread.sleep(1000);
        Instant logoutTime = Instant.now();

        loginTime = loginTime.truncatedTo(MINUTES);
        logoutTime = logoutTime.truncatedTo(MINUTES);

        if (logoutTime.isAfter(loginTime))
            System.out.println(logoutTime);
        else
            System.out.println("Can't logout");
    }
}
