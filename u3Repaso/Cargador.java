package u3Repaso;

public abstract class Cargador extends Producto{
    public Cargador(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    public Cargador() {
        super();
    }
}
