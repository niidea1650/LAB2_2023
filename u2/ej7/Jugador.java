package u2.ej7;

import u1.ej5.Fecha;

class Jugador extends Persona {
    private int camiseta;

    public Jugador(String nombre, String direccion, int edad, int camiseta) {
        super(nombre, direccion, edad);
        this.camiseta = camiseta;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }
}


