package u3.ej3;

import u5.ej1.Semana;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

public class Persona {
    private String nombre;
    private String apellido;
    private int telefono;
    private Date f_nacimiento;


    public Persona(String nombre, String apellido, int telefono, Date f_nacimiento, HashSet<Semana> dias_habiles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.f_nacimiento = f_nacimiento;
    }

    public Persona(String nahuel, String genovesi, int telefono) {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}