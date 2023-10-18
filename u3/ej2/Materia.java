package u3.ej2;

import java.util.HashSet;

public class Materia {
    private String nombre;
    HashSet<Double> notas;

    public Materia() {
        this.nombre = "Laboratorio";
        this.notas = new HashSet<>();
    }

    public Materia(String nombre, HashSet<Double> notas) {
        this.nombre = nombre;
        notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Double> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<Double> notas) {
        this.notas = notas;
    }
    public void validarNotas(){
        for(double nota : notas){
            if(nota < 0 || nota > 10){
                notas.remove(nota);
            }
        }
    }
    public void agregarNota(double nota){
        this.notas.add(nota);
        validarNotas();
    }
    public double promedioMaterias(){
        double suma = 0.0;
        for(double nota : notas){
            suma += nota;
        }
        return suma / notas.size();
    }
}

