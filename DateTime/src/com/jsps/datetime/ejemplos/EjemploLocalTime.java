package com.jsps.datetime.ejemplos;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();
        System.out.println("Hora con formato completo: \t" + hora);
        System.out.println("Hora: \t" + hora.getHour());
        System.out.println("Minutos: \t" + hora.getMinute());
        System.out.println("Segundos: \t" + hora.getSecond());
        System.out.println("Nanosegundos: \t" + hora.getNano());

        LocalTime personal = LocalTime.of(6, 30);
        System.out.println("Método of para obtener un formato de tiempo personalizado \t" + personal);

        personal = LocalTime.parse("06:30");
        System.out.println("Método parse para dar como argumento un formato de tiempo de tipo String \t" + personal);

        LocalTime aumentar = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println("Aumentar 1 hora a la fecha establecida \t" + aumentar);

        LocalTime restar = LocalTime.of(6, 30).minus(1, ChronoUnit.HOURS);
        System.out.println("Restar 1 hora a la fecha establecida \t" + restar);

        boolean comparar = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
        System.out.println("Hora es antes de otra hora (comparar) : \t" + comparar);

        comparar = LocalTime.of(6, 30).isAfter(LocalTime.parse("07:30"));
        System.out.println("Hora es después de otra hora (comparar) : \t" + comparar);

    }
}