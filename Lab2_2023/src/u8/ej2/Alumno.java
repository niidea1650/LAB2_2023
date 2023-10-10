package u8.ej2;

import resto.Persona;

public class Alumno extends Persona {
    private int examenesRealizados;

    public Alumno(String nombre, int edad, String direccion, int examenesRealizados) {
        super(nombre, edad, direccion);
        this.examenesRealizados = examenesRealizados;
    }

    public int getExamenesRealizados() {
        return examenesRealizados;
    }

    public void setExamenesRealizados(int examenesRealizados) {
        this.examenesRealizados = examenesRealizados;
    }

    @Override
    public float obtenerDescuento() {
        return 0;
    }
}
