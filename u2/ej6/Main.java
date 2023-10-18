package u2.ej6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Nahuel", "Genovesi", LocalDate.of(2000, 1, 7), new ArrayList<>());
        alumno.agregarNota(90);
        alumno.agregarNota(85);
        alumno.agregarNota(75);
        Materia matematicas = new Materia("Matemáticas");
        Materia historia = new Materia("Historia");
        matematicas.agregarNota(95);
        matematicas.agregarNota(88);
        historia.agregarNota(70);
        historia.agregarNota(78);
        alumno.agregarMateria(matematicas);
        alumno.agregarMateria(historia);
        System.out.println("Notas del alumno: " + alumno.getNotas());
        System.out.println("Menor nota: " + alumno.menorNota());
        System.out.println("Mayor nota: " + alumno.mayorNota());
        System.out.println("Promedio general: " + alumno.PromedioGeneral());
        System.out.println("Promedio de Matemáticas: " + alumno.PromedioMateria("Matemáticas"));
        System.out.println("Promedio de Historia: " + alumno.PromedioMateria("Historia"));
    }
}

