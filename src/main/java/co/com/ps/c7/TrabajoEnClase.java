package co.com.ps.c7;

public class TrabajoEnClase {
    public static void main(String[] args) {
        int [] numeros =new int[10];
        numeros [0]= 30;
        numeros [1]= 25;
        numeros [2]= 12;
        numeros [3]= 65;
        numeros [4]= 23;
        numeros [5]= 1;
        numeros [6]= 22;
        numeros [7]= 83;
        numeros [8]= 24;
        numeros [9]= 13;

        int nMayor=numeros[0];
        int nMenor=numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > nMayor) {
                nMayor = numeros[i];
            }
            if (numeros[i] < nMenor) {
                nMenor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + nMayor);
        System.out.println("El numero menor es: " + nMenor);
    }
}
