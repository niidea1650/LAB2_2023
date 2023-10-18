package u1.ej4;

import u7.ej5.Bebida;

import java.util.HashMap;

public class Persona {
    private String nombre;
    private String direccion;
    private int edad;

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
