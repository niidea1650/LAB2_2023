package u7.ej2;

import java.util.Date;

public class Presion extends Sensor{
    public Presion() {
        super();
    }

    public Presion(Date fecha, boolean conectado, int medida) {
        super(fecha, conectado, medida);
    }
    @Override
    public String info() {
        return "Fecha: " + this.getFecha() +
                "Conectado: " + this.isConectado() +
                "Medida: " + this.getMedida();
    }
}
