package u1.ej3;

public class Coche {
    private String marca;
    private String modelo;
    private Color color;
    private double velocidad;


    public Coche(String marca, String modelo, Color color, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public void acelerar(double velocidadAcelerar){
        velocidad += velocidadAcelerar;
    }
    public void frenar(double velocidadFrenar){
        if((velocidad - velocidadFrenar) > 0) {
            velocidad -= velocidadFrenar;
        }else{
            velocidad = 0;
        }
    }
    public void verVelocidad(){
        System.out.println("Velocidad actual: " + velocidad);
    }
}
