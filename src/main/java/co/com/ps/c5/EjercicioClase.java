package co.com.ps.c5;
import  java.util.Scanner;
public class EjercicioClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");//escribir
        int edad = scanner.nextInt();//Leer
        int aNac=2023-edad;

        System.out.println("Su año de nacimiento es "+aNac);


    }

}
