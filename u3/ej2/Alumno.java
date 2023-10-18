package u3.ej2;

import utilidades.Persona;

import java.util.ArrayList;
import java.util.HashSet;

public class Alumno extends Persona {
    private String division;
    private Fecha fechaDeNacimiento;
    private ArrayList<Materia>materias;

    @Override
    public String toString() {
        return super.toString() +
                "Alumno{" +
                "division='" + division + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento.toString() +
                ", materias=" + materias.toString() +
                '}';
    }

    public Alumno() {
        super("Tomas","Caserez",28,"Por ahi");
        this.fechaDeNacimiento = new Fecha(2,12,2005);
        this.materias = new ArrayList<Materia>();
        materias.add(new Materia("Literatura", new HashSet<>()));
        materias.add(new Materia("Fisica", new HashSet<>()));
        materias.add(new Materia("Matematicas", new HashSet<>()));
    }

    public Alumno(String nombre,String apellido,int edad,String direccion, int dia, int mes, int anio, ArrayList<Materia>materias ) {
        super(nombre,apellido,edad,direccion);
        this.fechaDeNacimiento = new Fecha(dia,mes,anio);
        this.materias = materias;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double menorNota(){
        double notaMenor = 10;
        for (Materia materia : materias) {
            for (double nota : materia.notas) {
                if (notaMenor > nota) {
                    notaMenor = nota;
                }
            }
        }
        return notaMenor;
    }
    public double mayorNota(){
        double notaMayor = 0.0;
        for (Materia materia : materias) {
            for (double nota : materia.notas) {
                if (notaMayor > nota) {
                    notaMayor = nota;
                }
            }
        }
        return notaMayor;
    }


    public void agregarMateria(Materia materia){
        materias.add(materia);
    }

    public double promedioNotas(){
        double suma = 0.0;
        int cantNotas = 0;
        for(Materia materia : materias){
            for(double nota : materia.notas){
                suma += nota;
                cantNotas++;
            }
        }
        return suma / cantNotas;
    }
}
