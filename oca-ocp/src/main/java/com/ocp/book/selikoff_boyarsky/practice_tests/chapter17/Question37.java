package com.ocp.book.selikoff_boyarsky.practice_tests.chapter17;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Question37 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
        LocalDate date2 = date1.plusDays(2).minusDays(1).minusDays(1);
        System.out.println(date2);
        System.out.println(date1.equals(date2));

        Period period = Period.ofYears(1).ofMonths(6).ofDays(3);
        System.out.println(period);
    }
}
