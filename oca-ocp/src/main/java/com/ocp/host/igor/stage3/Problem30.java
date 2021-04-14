package com.ocp.host.igor.stage3;

import java.time.LocalDate;
import java.time.Month;

public class Problem30 {
    public static void main(String[] args) {
        LocalDate javaBirthday = LocalDate.of(1995, Month.MAY, 23);
        LocalDate twentiethAnniversary = javaBirthday.plusYears(20);
        twentiethAnniversary.plusDays(1);                             //line n1
        System.out.println(twentiethAnniversary);
    }
}
