package u2.ej5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(90);
        notas.add(85);
        notas.add(78);
        ArrayList<String> materias = new ArrayList<>();
        materias.add("Matemáticas");
        materias.add("Historia");
        LocalDate fechaNac = LocalDate.of(2000, 5, 15);
        Alumno alumno = new Alumno("Juan", "Pérez", fechaNac, notas);
        alumno.agregarNota(95);
        alumno.agregarNota(88);
        int notaBaja = alumno.menorNota();
        int notaAlta = alumno.mayorNota();

        System.out.println("Notas: " + alumno.getNotas());
        System.out.println("Menor Nota: " + notaBaja);
        System.out.println("Mayor Nota: " + notaAlta);
    }
}

