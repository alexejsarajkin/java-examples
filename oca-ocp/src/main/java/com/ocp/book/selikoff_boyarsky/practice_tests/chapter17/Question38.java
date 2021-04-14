package com.ocp.book.selikoff_boyarsky.practice_tests.chapter17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Question38 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 5, 13);
        LocalTime time = LocalTime.of(10, 0);
        LocalDateTime trainDay = LocalDateTime.of(date, time);
//        Instant instant = trainDay.toInstant();
//        instant = instant.plus(1, ChronoUnit.DAYS);
//        System.out.println(instant);
    }
}
