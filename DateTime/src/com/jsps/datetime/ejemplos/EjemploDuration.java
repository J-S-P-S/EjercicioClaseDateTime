package com.jsps.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {

        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(2);

        Duration intervalo = Duration.between(fecha1, fecha2);
        System.out.println("Intervalo entre las 2 fechas: " + intervalo);
        System.out.println("Tiempo transcurrido en segundos: " + intervalo.getSeconds());
        System.out.println("Tiempo transcurrido en horas: " + intervalo.toHours());
        System.out.println("Tiempo transcurrido en días: " + intervalo.toDays());

    }
}