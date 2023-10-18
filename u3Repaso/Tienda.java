package u3Repaso;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Tienda(){
        productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
            productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public void modificarProducto(){
        for(int i = 0; i < productos.size(); i++){
        }
    }
}
