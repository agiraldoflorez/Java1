package co.com.ps.c7;
import java.util.ArrayList;
import java.util.List;

public class Investigacion {
    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();

        miLista.add("Mauricio"); //0
        miLista.add("Alan");//1
        miLista.add("");//1
        miLista.add("David");//2
        miLista.add("Carlos");//3
        miLista.add("Juan");

        miLista.stream().forEach(System.out::println);//REaliza una iteración en la lista e imprime los elementos
        //Los 2 puntos se llaman interface funtional
    }


}
