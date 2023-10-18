package u3Repaso;

public class Resolucion {
    private int ancho;
    private int altura;
    public Resolucion(){
        this.altura = 1920;
        this.ancho = 1080;
    }

    public Resolucion(int ancho, int altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
