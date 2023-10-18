package u3.ej3;

import java.util.HashSet;

public class Compu {
    private HashSet<Componente> componentes;
    private Cliente cliente;
    private float precioTotal;

    public Compu(HashSet<Componente> componentes, Cliente cliente, float precioTotal) {
        this.componentes = componentes;
        this.cliente = cliente;
        this.precioTotal = precioTotal;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public HashSet<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(HashSet<Componente> componentes) {
        this.componentes = componentes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarComponente(Componente componente) throws StockException {
        if(componente.getStock() <= 0) {
            throw new StockException("No hay stock");
        }
        this.getComponentes().add(componente);
        componente.bajarStock();
        precioTotal += componente.getPrecio();
    }
}
