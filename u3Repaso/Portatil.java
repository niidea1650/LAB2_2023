package u3Repaso;

public class Portatil extends Cargador{
    private int cantCargas;

    public Portatil(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock);
        this.cantCargas = cantCargas;
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}
