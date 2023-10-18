package u3.ej2;

public class Plato {
    private String nombre;
    private float precio;

    public Plato(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public Plato(){
        nombre = "Pancho";
        precio = 300;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
