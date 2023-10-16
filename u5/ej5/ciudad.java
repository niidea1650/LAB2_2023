package u5.ej5;

import java.util.HashSet;

public class ciudad extends lugar{
    HashSet<Barrio> barrio = new HashSet<Barrio>();

    public ciudad(String nombre, int codigo, HashSet<coordenadas> coordenada) {

        super(nombre, codigo, coordenada);
    }

    public HashSet<Barrio> getBarrio() {

        return barrio;
    }

    public void setBarrio(HashSet<Barrio> barrio) {

        this.barrio = barrio;
    }
    @Override
    public int calcPoblacion(){
        int cantPo = 0;
        for (Barrio barr:barrio){
            barr.getPoblacion();
            cantPo = cantPo + barr.getPoblacion();
        }
        return cantPo;
    }
}
