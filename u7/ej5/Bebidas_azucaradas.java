package u7.ej5;


public class Bebidas_azucaradas extends Bebida{

    private int cantidad_azúcar;
    private static int positivo = 1;
    private  int negativo;

    public Bebidas_azucaradas(String nombre, int positivo, int negativo) {
        super(nombre, positivo, negativo);
    }

    @Override
    void negativos(int negativo) {
        negativo = (cantidad_azúcar*10);
    }

    @Override
    int cantidad() {
        return 0;
    }

}