package co.com.ps.c12;

import co.com.ps.c12.EnumSuma;

import java.util.Arrays;
//organizar un arreglo de 10 numero con stream y luego calcular de la suma de ellos, el mesnaje debe estar en enums
public class TrabajoFinal {

    public static void main(String[] args) {
        int[] array = {1,5,6,3,7,2,0,43,45};
        integer arrayOrdenado = Arrays.stream(array)
                .sorted()
                .sum();
        EnumSuma enumSuma =EnumSuma.MENSAJE;
        System.out.println(enumSuma.getMensaje() + " " + arrayOrdenado.toString());

    }
}
