package com.ocp.examtopics;

import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public class Question112 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.of(6, 30);

        long timeToBreakfast;

        LocalTime officeStart = LocalTime.of(7, 30);

        if (officeStart.isAfter(now))
            timeToBreakfast = now.until(officeStart, MINUTES);
        else
            timeToBreakfast = now.until(officeStart, HOURS);

        System.out.println(timeToBreakfast);
    }
}

// 60
