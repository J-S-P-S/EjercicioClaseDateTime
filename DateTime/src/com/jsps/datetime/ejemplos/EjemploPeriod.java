package com.jsps.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2022, 12, 25);
        LocalDate fecha2 = LocalDate.of(2020, 11, 20);
        //LocalDate fecha3 = fecha2.withMonth(5); Es como el método set pero devuelven una nueva instancia, es inmutable.

        Period periodo = Period.between(fecha2, fecha1);
        System.out.println("Periodo: " + periodo);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días",
                fecha2, fecha1, periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }
}