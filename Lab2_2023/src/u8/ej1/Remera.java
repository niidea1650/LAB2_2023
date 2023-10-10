package u8.ej1;

import u7.Membresia;

public class Remera extends Ropa {
    private int espalda;
    private int contorno;
    private int torso;

    public int getEspalda() {
        return espalda;
    }

    public void setEspalda(int espalda) {
        this.espalda = espalda;
    }

    public int getContorno() {
        return contorno;
    }

    public void setContorno(int contorno) {
        this.contorno = contorno;
    }

    public int getTorso() {
        return torso;
    }

    public void setTorso(int torso) {
        this.torso = torso;
    }

    public Remera(String color, Material material, String marca, Estado estado, int espalda, int contorno, int torso) {
        super(color, material, marca, estado);
        this.espalda = espalda;
        this.contorno = contorno;
        this.torso = torso;

    }
    @Override
    public String caracteristicas() {
        String ropa;
        ropa = super.getColor() + " " + getMarca() + " " + getEstado() + " " + getMaterial().toString() + " " + this.espalda + " " + this.contorno + " " + this.torso;
        return ropa;
    }
}
