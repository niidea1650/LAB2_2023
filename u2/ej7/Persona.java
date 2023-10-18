package u2.ej7;

public class Persona {
    private String nombre;
    private String direccion;
    private int edad;

    public Persona(String nombre, String direccion, int edad) {
        this.nombre = this.nombre;
        this.direccion = this.direccion;
        this.edad = this.edad;
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
