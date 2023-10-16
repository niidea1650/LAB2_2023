package u5.ej5;


import java.util.HashSet;

public class Barrio extends lugar{
    int poblacion;
    public Barrio(String nombre, int codigo, HashSet<coordenadas> coordenada, int poblacion) {
        super(nombre, codigo, coordenada);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    @Override
    public int calcPoblacion(){
        return poblacion;
    }
}
