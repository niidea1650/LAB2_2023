package u8.ej1;

import java.time.LocalDate;
import java.util.HashMap;

public class Libro extends Leer implements Prestar{

    HashMap<Integer, Integer>cantPaginasPorCap;

    public Libro(int codigo, String titulo, int anio_publicado) {
        super(codigo, titulo, anio_publicado);
    }

    public HashMap<Integer, Integer> getCantPaginasPorCap() {
        return cantPaginasPorCap;
    }

    public void setCantPaginasPorCap(HashMap<Integer, Integer> cantPaginasPorCap) {
        this.cantPaginasPorCap = cantPaginasPorCap;
    }

    @Override
    public boolean prestar() {
        boolean presta;
        if(this.cantPaginasPorCap.size() % 2 != 0){
            System.out.println("El libro se dara prestado");
            presta = true;
        } else {
            System.out.println("El libro no se prestara");
            presta = false;
        }
        return presta;
    }
}