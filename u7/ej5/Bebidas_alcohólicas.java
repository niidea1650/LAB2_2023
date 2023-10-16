package u7.ej5;

public class Bebidas_alcohólicas extends Bebida{

    private int cantidad_alcohol;
    private static int positivo = 0;

    public Bebidas_alcohólicas(String nombre, int positivo, int negativo) {
        super(nombre, positivo, negativo);
    }

    @Override
    void negativos(int negativo) {
        negativo = (cantidad_alcohol*20);
    }

    @Override
    int cantidad() {
        return 0;
    }
}
