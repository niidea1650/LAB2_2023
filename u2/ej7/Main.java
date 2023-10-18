package u2.ej7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jugador1", "Dirección1", 25, 10);
        Jugador jugador2 = new Jugador("Jugador2", "Dirección2", 22, 5);
        ArrayList<Jugador> jugadoresEquipo1 = new ArrayList<>();
        jugadoresEquipo1.add(jugador1);
        jugadoresEquipo1.add(jugador2);
        ArrayList<Jugador> jugadoresEquipo2 = new ArrayList<>();
        ArrayList<Disponible> disponibilidadEquipo1 = new ArrayList<>();
        Disponible disponibilidad1 = new Disponible(Disponible.Turno.MAÑANA, 1);
        disponibilidadEquipo1.add(disponibilidad1);
        ArrayList<Disponible> disponibilidadEquipo2 = new ArrayList<>();
        Equipo equipo1 = new Equipo("Equipo1", 1, "Barrio1", jugadoresEquipo1, disponibilidadEquipo1);
        Equipo equipo2 = new Equipo("Equipo2", 2, "Barrio2", jugadoresEquipo2, disponibilidadEquipo2);
        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);
        Torneo torneo = new Torneo(equipos);
        torneo.armarFixture();
        torneo.mostrarFixture();
    }
}

