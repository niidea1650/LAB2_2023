package u8.ej2;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Examen>examenes;
    private HashSet<Alumno>alumnos;

    public Sistema(HashSet<Examen> examenes, HashSet<Alumno> alumnos) {
        this.examenes = examenes;
        this.alumnos = alumnos;
    }

    public Sistema() {
    }

    public HashSet<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(HashSet<Examen> examenes) {
        this.examenes = examenes;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public boolean cantAprobados(Examen examen){
        boolean escritos = false;
        boolean orales = false;
        boolean aprobo = false;
        for (Examen e : examenes){
            if (e.getEscrito().getNota() >= 6){
                System.out.println("Aprobo lo escrito");
                escritos = true;
            }
            if (e.getOral().getNotas() == Satisfaccion.SUFUCIENTE || e.getOral().getNotas() == Satisfaccion.EXCELENTE){
                System.out.println("Aprobo lo oral");
                orales = true;
            }
        }
        if (escritos == true && orales == true){
            System.out.println("Aprobo todo");
            aprobo = true;
        }
        return aprobo;
    }
}
