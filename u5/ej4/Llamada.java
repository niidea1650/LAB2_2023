package u5.ej4;

import java.util.Date;

public class Llamada {
    private Empleado emisor;
    private Empleado reseptor;
    private int duracion;
    private Date fecha;

    public Llamada(Empleado emisor, Empleado reseptor, int duracion, Date fecha) {
        this.emisor = emisor;
        this.reseptor = reseptor;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public Empleado getEmisor() {
        return emisor;
    }

    public void setEmisor(Empleado emisor) {
        this.emisor = emisor;
    }

    public Empleado getReseptor() {
        return reseptor;
    }

    public void setReseptor(Empleado reseptor) {
        this.reseptor = reseptor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
