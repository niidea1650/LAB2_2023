package u2.ej7;

import java.util.ArrayList;

public class Torneo {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> fixture;

    public Torneo(ArrayList<Equipo> equipos) {
        System.out.println("El límite de equipos es 8");
        this.equipos = equipos;
        limiteEquipos();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getFixture() {
        return fixture;
    }

    public void setFixture(ArrayList<Partido> fixture) {
        this.fixture = fixture;
    }

    // Getters y setters

    public void armarFixture() {
        fixture = new ArrayList<>();
        for (int i = 0; i < equipos.size(); i++) {
            for (int e = i + 1; e < equipos.size(); e++) {
                fixture.add(new Partido(equipos.get(i), equipos.get(e)));
            }
        }
    }

    public void mostrarFixture() {
        for (int i = 0; i < fixture.size(); i++) {
            if (fixture.get(i).getFecha() != null) {
                System.out.println("Partido " + (i + 1) + ": " + fixture.get(i).getFecha().getTurnoString() + " " + fixture.get(i).getFecha().getDiaString() + " " + fixture.get(i).getEquipo1().getNombre() + " vs " + fixture.get(i).getEquipo2().getNombre());
            } else {
                System.out.println("Partido " + (i + 1) + ": cancelado");
            }
        }
    }

    public void limiteEquipos() {
        for (int i = 8; i < equipos.size(); i++) {
            equipos.remove(i);
        }
    }
}
