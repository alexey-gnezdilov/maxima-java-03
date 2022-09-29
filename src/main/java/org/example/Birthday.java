package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Birthday {

    public static int getAge(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year,month,date);
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(birthDay, today);
    }

    public static LocalDate nextBirthday(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year,month,date);
        LocalDate today = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while (birthDay.isBefore(today)) {
            birthDay = birthDay.plusDays(1000);
        }
        return birthDay;
    }
}
