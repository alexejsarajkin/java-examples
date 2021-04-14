package com.ocp.book.selikoff_boyarsky.practice_tests.chapter17;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Question10 {
    public static void main(String[] args) {
        LocalDate waffleDay = LocalDate.of(2017, Month.MARCH, 25);
        Period period = Period.of(1, 6, 3);
        LocalDate later = waffleDay.plus(period);
        later.plusDays(1);
        LocalDate thisOne = LocalDate.of(2018, Month.SEPTEMBER, 28);
        LocalDate thatOne = LocalDate.of(2018, Month.SEPTEMBER, 29);
        System.out.println(later.isBefore(thisOne) + " "
                + later.isBefore(thatOne));
    }
}
