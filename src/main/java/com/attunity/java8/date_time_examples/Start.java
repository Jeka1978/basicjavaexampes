package com.attunity.java8.date_time_examples;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate tomorrow = now.plusDays(1);
        System.out.println(tomorrow);
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRANCE));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPAN));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.JAPAN));
        System.out.println(tomorrow.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH));

        LocalDate alexey = LocalDate.of(1991, 4, 10);
        LocalDate uhay = LocalDate.of(1957, 6, 3);


        long between = ChronoUnit.YEARS.between(uhay, alexey);
        System.out.println("between = " + between);


    }
}
