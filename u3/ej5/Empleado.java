package u3.ej5;

import u3.ej3.Persona;
import u5.ej1.Semana;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

public class Empleado extends Persona {
    private long DNI;
    private String pais;
    private int telefono;

    public Empleado(String nombre, String apellido, int telefono, Date f_nacimiento, HashSet<Semana> dias_habiles, long DNI, String pais, int telefono1) {
        super(nombre, apellido, telefono, f_nacimiento, dias_habiles);
        this.DNI = DNI;
        this.pais = pais;
        this.telefono = telefono1;
    }

    public Empleado(){
        super("Nahuel","genovesi",1212);
        DNI = 47031793L;
        pais = "Argentina";
        telefono = 5423;
    }
    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return (int) telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "DNI=" + DNI +
                ", pais='" + pais + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
