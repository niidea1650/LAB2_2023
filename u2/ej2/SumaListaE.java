package u2.ej2;

import java.util.ArrayList;

public class SumaListaE {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<String>();
        cadenas.add("Manzana");
        cadenas.add("Banana");
        cadenas.add("Cereza");
        cadenas.add("Curazno");
        char letraEspecifica = 'C';
        for (String cadena : cadenas) {
            if (cadena.charAt(0) == letraEspecifica) {
                System.out.println(cadena);
            }
        }
    }
}
