package u2.ej1;

import java.util.ArrayList;

public class SumaLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("La suma de los elementos del ArrayList es: " + suma);
    }
}
