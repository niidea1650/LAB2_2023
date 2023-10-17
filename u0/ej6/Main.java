package u0.ej6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Inserta números. Para terminar, introduce -1.");

        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            contador++;
        }

        System.out.println("Cantidad de números introducidos: " + contador);
    }
}

