package co.com.ps.c12;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println(fecha);

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha: " + fechaActual);
        fechaActual.plusDays(5);
        Calendar calendar = Calendar.getInstance();
        int año = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);
        int segundos = calendar.get(Calendar.SECOND);

        //Imprime la hora y la fecha actual
        System.out.println("Fecha: " + (dia+5) + "/" + mes + "/" + año);
        System.out.println("Hora: " + minutos + ":" + segundos);


    }
}
