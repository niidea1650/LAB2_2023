package u5.ej5;

import java.util.HashSet;

public class Provincia extends lugar{

    HashSet<ciudad> ciudades = new HashSet<ciudad>();
    public Provincia(String nombre, int codigo, HashSet<coordenadas> coordenada) {

        super(nombre, codigo, coordenada);
    }

    public HashSet<ciudad> getCiudades() {

        return ciudades;
    }

    public void setCiudades(HashSet<ciudad> ciudades) {

        this.ciudades = ciudades;
    }
    @Override
    public int calcPoblacion(){
        int cantP =0;
        for (ciudad city:ciudades){
            city.calcPoblacion();
            cantP = cantP + city.calcPoblacion();
        }
        return cantP;
    }
}
