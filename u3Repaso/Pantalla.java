package u3Repaso;

public class Pantalla extends Multimedia{
    private Tecnologia tecnoligia;
    private Resolucion resolucion;

    public Pantalla(String nombre, double precio, int stock, Tecnologia tecnoligia, Resolucion resolucion) {
        super(nombre, precio, stock);
        this.tecnoligia = tecnoligia;
        this.resolucion = resolucion;
    }

    public Tecnologia getTecnoligia() {
        return tecnoligia;
    }

    public void setTecnoligia(Tecnologia tecnoligia) {
        this.tecnoligia = tecnoligia;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }
}
