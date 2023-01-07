package com.jsps.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaCompleta = LocalDateTime.now();
        System.out.println("Fecha completa = " + fechaCompleta);

        fechaCompleta = LocalDateTime.of(2022, Month.DECEMBER, 24, 20, 45, 59, 10);
        System.out.println("Fecha completa personalizada = " + fechaCompleta);

        fechaCompleta = LocalDateTime.parse("2022-12-25T07:05:10.000000011");
        System.out.println("Fecha completa personalizada 2 = " + fechaCompleta);

        LocalDateTime fecha2 = fechaCompleta.plusDays(1).plusHours(3);
        System.out.println("Fecha inicial: " + fechaCompleta);
        System.out.println("Fecha con incremento: " + fecha2);
        fecha2 = fechaCompleta.minusDays(1).minusHours(3);
        System.out.println("Fecha con decremento: " + fecha2);

        Month mes = fechaCompleta.getMonth();
        System.out.println("Mes: " + mes);
        System.out.println("Así se puede con día, día del (mes,año, semana), con el año");

        String formato = fechaCompleta.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Formatos: " + formato);

        String formatoPersonalizado = fechaCompleta.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a"));
        System.out.println("Formato personalizado = " + formatoPersonalizado);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
        String f1 = fechaCompleta.format(df);
        System.out.println("Objeto LocalDateTime usando método .format y pasando objeto DateTimeFormatter con formato personalizado");
        System.out.println(f1);

        System.out.println("Los mismos objetos pero con diferente implementación");
        String f2 = df.format(fechaCompleta);
        System.out.println(f2);

    }
}