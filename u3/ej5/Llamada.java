package u3.ej5;

import u1.ej5.Fecha;

import java.security.interfaces.DSAKey;
import java.util.Date;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private Fecha fecha;
    private Date duracion;

    public Llamada(Empleado origen, Empleado destino, Fecha fecha, Date duracion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Llamada(){
        origen = new Empleado();
        destino = new Empleado();
        fecha = new Fecha();
        duracion = new Date();
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Llamada{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", fecha=" + fecha.toString() +
                ", duracion=" + duracion.toString() +
                '}';
    }
}
