package u8.ej4;

import java.util.HashSet;

public class Equipo {
    private String nombre;
    private HashSet<Jugador> plantel;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
