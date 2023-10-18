package u1.ej6;

public class Persona {
    private String nombre;
    private String direccion;
    private int edad;

    public Persona() {
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
