package u1.ej7;

public class Cafetera {
    private int maxCafe;
    private  int cafeActual;

    public Cafetera(){
        this.maxCafe = 1000;
        this.cafeActual = 0;
    }

    public Cafetera(int maxCafe) {
        this.maxCafe = maxCafe;
        this.cafeActual = maxCafe;
    }

    public Cafetera(int maxCafe, int cafeActual) {
        this.maxCafe = maxCafe;
        if(cafeActual < maxCafe) {
            this.cafeActual = cafeActual;
        }else{
            this.cafeActual = maxCafe;
        }
    }

    public int getMaxCafe() {
        return maxCafe;
    }

    public void setMaxCafe(int maxCafe) {
        this.maxCafe = maxCafe;
    }

    public int getCafeActual() {
        return cafeActual;
    }

    public void setCafeActual(int cafeActual) {
        this.cafeActual = cafeActual;
    }

    public void llenarCafetera(){
        cafeActual = maxCafe;
        System.out.println("la cantidad de cafe actual es:" + cafeActual);
    }

    public void servirTaza(int capacidad){
        if(cafeActual > capacidad){
            cafeActual -= capacidad;
        }else{
            cafeActual = 0;
        }
        System.out.println("la cantidad de cafe actual es:" + cafeActual);
    }

    public void vaciarCafetera(){
        cafeActual = 0;
        System.out.println("la cantidad de cafe actual es:" + cafeActual);
    }

    public void agregarCafe(int cantidad){
        if((cafeActual + cantidad) < maxCafe){
            cafeActual += cantidad;
        }else{
            cafeActual = maxCafe;
        }
        System.out.println("la cantidad de cafe actual es:" + cafeActual);
    }
}
