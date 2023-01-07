package com.jsps.datetime.ejemplos;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploItinerarioDeVuelo {
    public static void main(String[] args) {
        //  Formato fecha LocalDateTime 2021-09-23T12:45
        String fpartida = JOptionPane.showInputDialog("Ingrese una fecha (yyyy-MM-dd) ");
        String hpartida = JOptionPane.showInputDialog("Ingrese una hora (hh:MM:ss) ");

        LocalDateTime fechaLocal = LocalDateTime.parse(fpartida + "T" + hpartida);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss a, dd-MMMM-yyyy");

        //ZoneId newYork = ZoneId.of("America/New_York"); 1 forma
        //ZoneId newYork = ZoneId.of("America/New_York"); 2 forma
        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork); 1 forma
        //ZonedDateTime zonaNy = fechaLocal.atZone(newYork); 2 forma
        //ZonedDateTime zonaEsp = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00")); //3 forma
        ZonedDateTime zonaEsp = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Partida New York: " + f.format(zonaNy));
        System.out.println("Hora de llegada a Madrid: " + f.format(zonaEsp));

        //Todas las zonas Id que están disponibles
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }
}