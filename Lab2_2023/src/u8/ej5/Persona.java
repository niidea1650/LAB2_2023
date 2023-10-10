package u8.ej5;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fecha_n;

    public Persona(String nombre, String apellido, int edad, LocalDate fecha_n) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_n = fecha_n;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(LocalDate fecha_n) {
        this.fecha_n = fecha_n;
    }
}
