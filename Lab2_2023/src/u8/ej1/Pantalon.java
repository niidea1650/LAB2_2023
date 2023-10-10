package u8.ej1;

import u7.Membresia;

public class Pantalon extends Ropa {
    private int cintura;
    private int largo;
    private int cadera;

    public int getCintura() {
        return cintura;
    }

    public void setCintura(int cintura) {
        this.cintura = cintura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getCadera() {
        return cadera;
    }

    public void setCadera(int cadera) {
        this.cadera = cadera;
    }

    public Pantalon(String color, Material material, String marca, Estado estado, int cintura, int largo, int cadera) {
        super(color, material, marca, estado);
        this.cintura = cintura;
        this.largo = largo;
        this.cadera = cadera;

    }
    public void caractp(){
        String pant;
        pant = cintura + " " + largo + " " + cadera;
    }


    @Override
    public String caracteristicas() {
        String ropa;
        ropa = super.getColor() + " " + getMarca() + " " + getEstado() + " " + getMaterial().toString() + " " + this.largo + " " + this.cadera + " " + this.cintura;
        return ropa;
    }
}
