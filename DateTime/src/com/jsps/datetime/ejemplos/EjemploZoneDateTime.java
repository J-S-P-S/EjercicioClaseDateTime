package com.jsps.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZoneDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZoneId madrid = ZoneId.of("Europe/Madrid");

        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Zona horaria de New York: " + zonaNy);
        ZonedDateTime zonaEsp = zonaNy.withZoneSameInstant(madrid);
        System.out.println("Zona horaria de Madrid: " + zonaEsp);
        System.out.println();
        System.out.println("Ejemplo para calcular un trayecto desde Madrid hasta New York");
        System.out.println("Se debe tener en cuenta la diferencia horaria. \nSe supone un trayecto de 8 horas de vuelo");
        System.out.println();


        System.out.println("Hora de partida en New York: " + zonaNy);
        zonaEsp = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Hora de llegada a Madrid: " + zonaEsp);

    }
}