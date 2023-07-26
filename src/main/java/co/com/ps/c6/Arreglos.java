package co.com.ps.c6;

import java.util.ArrayList;
import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
       /* int[] miPrimerArreglo = new int[2];
        miPrimerArreglo[0]=10;
        System.out.println(miPrimerArreglo[0]);

        int[] miPrimerArreglo2 ={1,4,3,1000};

        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1]= "Maria";
        nombres[2] = "Carlos";

        String[] apellidos = {"lopez","ramirez"};

        List<String> pais = new ArrayList<>();
        pais.add("Paris");
        pais.add("Colombia");


        pais(nombres);
        */

        double[] notas = new double[3];
        notas[0] = 1.3;
        notas[1] = 5;
        notas[2] = 4.5;

        System.out.println("La nota promedio es: " + calcularNota(notas));

    }
        public static double calcularNota (double[] notas){
            double acumulador = 0;
            for (double nota : notas){
                acumulador = acumulador + nota;
              }
            return acumulador / notas.length;


        }
    }

