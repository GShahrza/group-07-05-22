package main.java.lesson_20.lesson;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        LocalDate ld = LocalDate.of(2022,11,21);
        LocalDate now = LocalDate.now();

        LocalDate ex = now.plusDays(10);
        System.out.println("now : " + ex);
        System.out.println(ld);

        System.out.println(ld.minusDays(10));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
