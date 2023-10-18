package u1.ej1;

public class Circulo {
    private double radio;

    private static double PI = 3.14;

    public Circulo(){
        this.radio = 2;
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {

        this.radio = radio;
    }

    public double area(){

        return Circulo.PI * Math.pow(radio, 2);
    }

    public double perimetro(){

        return 2 * Circulo.PI * radio;
    }
}
