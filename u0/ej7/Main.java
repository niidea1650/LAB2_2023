package u0.ej7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Inserta números. Para terminar, introduce -1.");

        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            count++;
            sumaTotal += numero;

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero > 0) {
                sumaPositivos += numero;
            } else {
                sumaNegativos += numero;
            }
        }

        if (count > 0) {
            System.out.println("Mayor número introducido: " + mayor);
            System.out.println("Menor número introducido: " + menor);
            System.out.println("Suma de todos los números: " + sumaTotal);
            System.out.println("Suma de los números positivos: " + sumaPositivos);
            System.out.println("Suma de los números negativos: " + sumaNegativos);
        }
    }
}


