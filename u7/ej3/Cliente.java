package u7.ej3;


import u5.ej1.Semana;

import java.util.Date;
import java.util.HashSet;

public class Cliente extends Persona {
    private long celu;
    private String metodoPago;
    private Tarjeta tarjeta;

    public Cliente(String nombre, String apellido, int telefono, Date f_nacimiento, HashSet<Semana> dias_habiles, long celu, String metodoPago, Tarjeta tarjeta) {
        super(nombre, apellido, telefono, f_nacimiento, dias_habiles);
        this.celu = celu;
        this.metodoPago = metodoPago;
        this.tarjeta = tarjeta;
    }
    public long getCelu() {
        return celu;
    }

    public void setCelu(long celu) {
        this.celu = celu;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
