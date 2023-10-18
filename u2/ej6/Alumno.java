package u2.ej6;


import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private ArrayList<Integer> notas;;
    private ArrayList<Materia> materias;

    public Alumno(String nombre, String apellido, LocalDate fechaNac, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.notas = notas;
        this.materias = new ArrayList<>();
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
    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public double PromedioMateria(String nombreMateria) {
        for (Materia materia : materias) {
            if (materia.getNombre().equals(nombreMateria)) {
                return materia.calcularPromedio();
            }
        }
        return 0.0;
    }

    public double PromedioGeneral() {
        if (materias.isEmpty()) {
            return 0.0;
        }

        double sumaPromedios = 0.0;
        for (Materia materia : materias) {
            sumaPromedios += materia.calcularPromedio();
        }

        return sumaPromedios / materias.size();
    }
}
