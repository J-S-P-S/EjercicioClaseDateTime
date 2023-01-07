package com.jsps.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTimeFormato {
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

        //DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss"); //HH 12 horas sin adicionar am,pm
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a"); //HH 12 horas y adicionar am,pm
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a"); //hh 24 horas am, pm
        String f = hora.format(df);
        System.out.println(f);

        personal = LocalTime.parse("18:30:25");
        String f2 = personal.format(df);
        System.out.println(f2);

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String f3 = personal.format(df2);
        System.out.println(f3);

        String f4 = df.format(hora);
        System.out.println("Hora actual con formato = " + f4);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("Hora máxima del día = " + max);
        System.out.println("Hora minima del día = " + min);

    }
}