package u8.ej2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Escrito escrito = new Escrito(LocalDateTime.now(), 6);
        Oral oral = new Oral(Satisfaccion.SUFUCIENTE);
        Examen e = new Examen(LocalDate.of(1,1,1), escrito, oral);
        Alumno a = new Alumno("Ashe", 6, "ashe", 4);

        sistema.getExamenes().add(e);
        sistema.getAlumnos().add(a);

        sistema.cantAprobados(e);
    }
}