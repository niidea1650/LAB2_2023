package u8.ej3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Trabajador extends Persona implements Menasje{
    private int cuil;
    private int sueldo;
    private int direccion;
    private LocalTime empieza;
    private LocalTime termina;
    public Trabajador(String nombre, String apellido, int dni, LocalDate fechaNac, int cuil, int sueldo, int direccnion, LocalTime empieza,LocalTime termina) {
        super(nombre, apellido, dni, fechaNac);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccnion;
        this.termina = termina;
        this.empieza = empieza;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }


    @Override
    public void enviarMensaje(Partido partido) {
        if (this.empieza.isBefore(LocalTime.now()) && this.termina.isAfter(LocalTime.now()) ){
            System.out.println(partido);
        }else{
            System.out.println("no puede mandarlo");
        }
    }

    @Override
    public void hacerCampaña() {
        if(this.empieza.isBefore(LocalTime.now()) && this.termina.isAfter(LocalTime.now()) ){
            System.out.println("Yo," + this.getNombre() + "te invito a que: Vote por el partido para un mejor futuro" );
        }else{
            System.out.println("no puede");
        }
    }
}