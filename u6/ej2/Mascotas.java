package u6.ej2;

import java.util.HashSet;

public abstract class Mascotas {
    private String nombre;
    private String duenio;
    private String saludo;
    private Enum Tipo;
    public Mascotas(String nombre, String duenio, String saludo, Enum tipo) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.saludo = saludo;
        Tipo = tipo;
    }

    public Enum getTipo() {
        return Tipo;
    }

    public void setTipo(Enum tipo) {
        Tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    public Mascotas(String nombre, String saludo, String duenio) {
        this.saludo = saludo;
    }

    public Mascotas(Enum tipo) {
        Tipo = tipo;
    }


    abstract void saludo(boolean esDuenio);

    abstract void alimentar();
    abstract void alegria();
}
