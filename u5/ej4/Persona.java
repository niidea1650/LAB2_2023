package u5.ej4;

import u5.ej1.Semana;

import java.util.Date;
import java.util.HashSet;

public class Persona {
    private String nombre;
    private String apellido;
    private int telefono;
    private Date f_nacimiento;


    public Persona(String nombre, String apellido, int telefono, Date f_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.f_nacimiento = f_nacimiento;

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

    public Date getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(Date f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
}
