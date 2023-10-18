package u2.ej5;


import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private ArrayList<Integer> notas;;

    public Alumno(String nombre, String apellido, LocalDate fechaNac, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    public void agregarNota(int nota){
        notas.add(nota);
    }
    public int menorNota(){
        int notaBaja = notas.get(0);
        for (int i : notas){
            if (i > notaBaja){
                notaBaja = i;
            }
        }
        return notaBaja;
    }
    public int mayorNota(){
        int notaAlta = notas.get(0);
        for (int i : notas){
            if (i > notaAlta){
                notaAlta = i;
            }
        }
        return notaAlta;
    }
}
