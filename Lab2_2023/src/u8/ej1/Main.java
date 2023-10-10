package u8.ej1;

import jdk.internal.org.objectweb.asm.commons.RemappingMethodAdapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Remera r1 = new Remera("amarillo", Material.LANA, "PUMA", Estado.MANCHADO, 2, 2, 2);
        Pantalon p1 = new Pantalon("rojo", Material.ALGODON, "NIKE", Estado.BIEN, 2, 2, 2);
        Libro l1 = new Libro(123, "ashe", 2023);
        Revista re1 = new Revista(234, "nashe", 2023, LocalDate.of(2023, 9, 20));

        




    }
}
