package com.jsps.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        System.out.println("yyyy-MM-dd -> " + fecha);
        System.out.println("Día: " + fecha.getDayOfMonth());
        System.out.println("Mes: " + fecha.getMonth());
        System.out.println("Año: " + fecha.getYear());
        System.out.println("Día del año: " + fecha.getDayOfYear());
        System.out.println("Era: " + fecha.getEra() + " (contemporánea).");

        System.out.println("Mes en español: " + fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es","ES")));
        System.out.println("Día en español: " + fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es","ES")));


        fecha = LocalDate.of(2020,1,5);
        System.out.println("yyyy-MM-dd -> " + fecha);

        fecha = LocalDate.of(2020, Month.DECEMBER, 11);
        System.out.println("yyyy-MM-dd -> " + fecha);

        fecha = LocalDate.parse("2020-02-01");
        System.out.println("yyyy-MM-dd -> " + fecha);

        LocalDate f = LocalDate.now().plusDays(1); //Sumar un día
        System.out.println("yyyy-MM-dd -> " + f);

        LocalDate f2 = LocalDate.now().minusMonths(1); //Restar un mes
        System.out.println("yyyy-MM-dd -> " + f2);

        LocalDate f3 = LocalDate.now().minus(1, ChronoUnit.MONTHS); //Restar un mes con otro método y un enum
        System.out.println("yyyy-MM-dd -> " + f3);

        DayOfWeek d = LocalDate.parse("2022-12-25").getDayOfWeek();
        System.out.println(d);

        int dnum = LocalDate.of(2022, 12, 25).getDayOfMonth();
        System.out.println(dnum);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println(esBisiesto);

        boolean compararFecha = LocalDate.now().isBefore(LocalDate.parse("2020-12-25"));
        System.out.println(compararFecha);

        boolean compararFecha2 = LocalDate.now().isAfter(LocalDate.parse("2020-12-25"));
        System.out.println(compararFecha2);

    }
}