package co.com.ps.c3;

import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esta es la calculadora");
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();


        int rest1=num1-num2;
        int suma= num1+num2;
        int mult =num1*num2;
        int div= num1/num2;

        System.out.println("La suma de las constantes es "+ suma);
        System.out.println("La resta de las constantes es "+ rest1);
        System.out.println("La multiplicación de las constantes es "+ mult);
        System.out.println("La división de las constantes es "+ div);

    }
}
