package co.com.ps.c3;
import org.w3c.dom.ls.LSOutput;
import javax.swing.*;
import java.util.Scanner;
public class EntradaySalidaDeDatos {
    public static void main(String[] args) {
        //JOptionPane.showInputDialog(null); Entrada de datos en ventana grafica
        //Crear un objeto escaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //Leer un numero entero desde el teclado
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        //Leer una cadena de caracteres desde el teclado
        System.out.print("Ingresa tu nombre: ");//Escribir
        String nombre = scanner.next();//leer

        //Mostrar la salida en la consola
        System.out.println("El numero ingresado es: " + numero);
        System.out.println("Hola, " + nombre + "!");

        scanner.close();

    }



}
