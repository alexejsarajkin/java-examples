package com.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        // Milliseconds from 01.01.1970
        Date date = new Date(0); // Added in Java from 23.01.1996
        System.out.println(date);

        // Add to time week, year, second atd.
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println(calendar.getTime());

        // Print date by template
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat.format(calendar.getTime()));

        // Print date in custom format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        // Parse date
        Date parseDate = simpleDateFormat.parse("05-12-2020");
        System.out.println(parseDate);

        // LocalDate now
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(localDate);
        System.out.println(dayOfWeek);
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);

        // Parse Local Date
        LocalDate localDateOf = LocalDate.of(1914, Month.DECEMBER, 31);
        System.out.println(localDateOf);

        // Operation with LocalDate
        LocalDate localDateOperation = LocalDate.of(1914, Month.FEBRUARY, 28);
        localDateOperation = localDateOperation.plusYears(4);
        localDateOperation = localDateOperation.plusMonths(3);
        localDateOperation = localDateOperation.plusDays(14);
        System.out.println(localDateOperation);

        localDateOperation = localDateOperation.minusMonths(10);
        localDateOperation = localDateOperation.minusDays(3);
        System.out.println(localDateOperation);

        // Format Local date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(localDateOperation.format(dateTimeFormatter));

        // Parse local date
        LocalDate localDateParse = LocalDate.parse("01-11-2019", dateTimeFormatter);
        System.out.println(localDateParse);

        // Local date period
        LocalDate logestDay = LocalDate.now().withMonth(6).withDayOfMonth(23);
        System.out.println("Period - " + Period.between(logestDay, LocalDate.now()));

        // Local time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTimeOf = LocalTime.of(10, 43, 12);
        System.out.println(localTimeOf);

        localTimeOf = localTimeOf.minusHours(2);
        localTimeOf = localTimeOf.minusMinutes(34);
        System.out.println(localTimeOf);

        localTimeOf = localTimeOf.plusHours(4);
        localTimeOf = localTimeOf.plusMinutes(18);
        System.out.println(localTimeOf);

        // Time zone
        LocalTime localTimeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        LocalTime localTimeTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("India Time Zone: " + localTimeKolkata);
        System.out.println("Japan Time Zone: " + localTimeTokyo);

        long hours = ChronoUnit.HOURS.between(localTimeKolkata, localTimeTokyo);
        System.out.println("Hours between two Time Zone: " + hours);

        long minutes = ChronoUnit.MINUTES.between(localTimeKolkata, localTimeTokyo);
        System.out.println("Minutes between two time zone: " + minutes);

        // Get available zines
        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }
    }
}
