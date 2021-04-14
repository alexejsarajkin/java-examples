package com.ocp.book.selikoff_boyarsky.review.ch5;

import java.time.LocalDate;
import java.time.Month;

public class Question8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
