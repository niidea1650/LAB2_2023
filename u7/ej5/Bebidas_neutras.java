package u7.ej5;

public class Bebidas_neutras extends Bebida{

    private int positivo;
    private int negativo;

    public Bebidas_neutras(String nombre, int positivo, int negativo) {
        super(nombre, positivo, negativo);
    }

    @Override
    void negativos(int negativo) {
    }

    @Override
    int cantidad() {
        return 0;
    }
}
