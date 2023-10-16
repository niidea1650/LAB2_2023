package u7.ej5;
import java.util.HashSet;

public abstract class Bebida {
    private String nombre;

    private int negativo;

    public Bebida(String nombre, int positivo, int negativo) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract void negativos(int negativo);
    abstract int cantidad();
}
