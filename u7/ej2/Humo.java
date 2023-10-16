package u7.ej2;


import java.util.Date;

public class Humo extends Sensor{
    public Humo() {
        super();
    }

    public Humo(Date fecha, boolean conectado, int medida) {
        super(fecha, conectado, medida);
    }

    @Override
    public String info() {
        return "Fecha: " + this.getFecha() +
                "Conectado: " + this.isConectado() +
                "Medida: " + this.getMedida();
    }
}
