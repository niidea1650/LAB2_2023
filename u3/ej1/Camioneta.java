package u3.ej1;

import u1.ej3.Color;

public class Camioneta extends Vehiculo {
    private String patente;
    private int capacidad;
    private int peso;
    public Camioneta() {
        super();
        this.patente = "AB354CSF";
        this.capacidad = 500;
        this.peso = 250;

    }

    public Camioneta(String marca, String modelo, int año, Color color, int cant_ruedas, String patente, int capacidad, int peso) {
        super(marca, modelo, año, color, cant_ruedas);
        this.patente = patente;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void agregarCarga(int carga){
        if((carga + peso) <= capacidad){
            peso += carga;
        }else{
            peso = capacidad;
        }
    }

}
