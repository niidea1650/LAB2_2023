package u2.ej7;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private int numeroCapitan;
    private String barrio;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Disponible> disponibilidad;

    public Equipo(String nombre, int capitan, String barrio, ArrayList<Jugador> jugadores, ArrayList<Disponible> disponibilidad) {
        this.nombre = nombre;
        this.numeroCapitan = capitan;
        this.barrio = barrio;
        this.jugadores = jugadores;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCapitan() {
        return numeroCapitan;
    }

    public void setNumeroCapitan(int numeroCapitan) {
        this.numeroCapitan = numeroCapitan;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Disponible> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(ArrayList<Disponible> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // Getters y setters

    public void noRepetir() {
        for (Jugador jugador : jugadores) {
            for (Jugador jugador1 : jugadores) {
                if (jugador.getCamiseta() == jugador1.getCamiseta()) {
                    Scanner entrada = new Scanner(System.in);
                    jugador1.setCamiseta(entrada.nextInt());
                }
            }
        }
    }
}
