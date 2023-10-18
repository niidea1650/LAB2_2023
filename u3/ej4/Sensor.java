package u3.ej4;

import java.util.Date;


public abstract class Sensor {
    private Date fecha;
    private boolean conectado;
    private int medida;

    public Sensor() {
        this.fecha = new Date(2002,7,10);
        this.conectado = true;
        this.medida = 20;
    }

    public Sensor(Date fecha, boolean conectado, int medida) {
        this.fecha = fecha;
        this.conectado = conectado;
        this.medida = medida;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }
    public abstract String info();
}