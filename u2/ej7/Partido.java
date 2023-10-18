package u2.ej7;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private Disponible fecha;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        ponerFecha();
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Disponible getFecha() {
        return fecha;
    }

    public void setFecha(Disponible fecha) {
        this.fecha = fecha;
    }

    public void ponerFecha() {
        boolean fechaEncontrada = false;
        for (int i = 0; i < equipo1.getDisponibilidad().size(); i++) {
            for (int e = 0; e < equipo2.getDisponibilidad().size(); e++) {
                if (equipo1.getDisponibilidad().get(i).getDia() == equipo2.getDisponibilidad().get(e).getDia() && equipo1.getDisponibilidad().get(i).getTurno() == equipo2.getDisponibilidad().get(e).getTurno() && !fechaEncontrada) {
                    fecha = equipo1.getDisponibilidad().get(i);
                    equipo1.getDisponibilidad().remove(i);
                    equipo2.getDisponibilidad().remove(e);
                    fechaEncontrada = true;
                }
            }
        }
        if (!fechaEncontrada) {
            System.out.println("No se encontró fecha entre " + equipo1.getNombre() + " y " + equipo2.getNombre());
        }
    }
}

