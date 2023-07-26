package co.com.ps.c7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
public class Ciclos {
    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();
        miLista.add("Mauricio");
        miLista.add("Alan");
        miLista.add("David");
        miLista.add("Carlos");
        miLista.add("Juan");

        for (String nombre :miLista){
            System.out.println(nombre);
        }
        System.out.println("_____________________________");
        for (int i=0; i< miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }

        double[] notas = new double[4];


        notas[0] = 1.3;
        notas[1] = 5.0;
        notas[2] = 4.5;
        notas[3] = 2.5;
        for (double nota :notas) {
            System.out.println(nota);
        }

        System.out.println("_________________________________________");
        for (int i=0; i< notas.length; i++){
            System.out.println(notas[i]);
        }
        for (int i = 1; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

}
