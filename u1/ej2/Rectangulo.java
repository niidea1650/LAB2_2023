package u1.ej2;

public class  Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(){
        this.base = 2.00;
        this.altura = 4.00;
    }
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2*base + 2*altura;
    }
}