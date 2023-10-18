package u2.ej6;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Integer> notas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void agregarNota(int nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }

        return (double) suma / notas.size();
    }
}
