package u2.ej7;

public class Disponible {
    public enum Turno { MAÑANA, TARDE, NOCHE }
    private Turno turno;
    private int dia;

    public Disponible(Turno turno, int dia) {
        this.turno = turno;
        this.dia = dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    // Getters y setters

    public String getTurnoString() {
        switch (turno) {
            case MAÑANA:
                return "Mañana";
            case TARDE:
                return "Tarde";
            case NOCHE:
                return "Noche";
            default:
                return "----";
        }
    }

    public String getDiaString() {
        switch (dia) {
            case 0:
                return "Lunes";
            case 1:
                return "Martes";
            case 2:
                return "Miercoles";
            case 3:
                return "Jueves";
            case 4:
                return "Viernes";
            case 5:
                return "Sabado";
            case 6:
                return "Domingo";
            default:
                return "---";
        }
    }
}

