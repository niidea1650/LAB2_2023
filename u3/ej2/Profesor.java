package u3.ej2;

import utilidades.Persona;

public class Profesor extends Persona {
    private int descuento;

    public Profesor(String nombre, String apellido, int edad, String direccion, int descuento) {
        super(nombre, apellido, edad, direccion);
        this.descuento = descuento;
    }
    public Profesor(){
        super();
        descuento = 10;
    }
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Profesor{" +
                "descuento=" + descuento +
                '}';
    }
}
