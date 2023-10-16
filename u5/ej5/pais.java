package u5.ej5;


import java.util.HashSet;

public class pais extends lugar{
    HashSet<Provincia> Provincias = new HashSet<Provincia>();
    public pais(String nombre, int codigo, HashSet<coordenadas> coordenada) {

        super(nombre, codigo, coordenada);
    }

    public HashSet<Provincia> getProvincias() {
        return Provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        Provincias = provincias;
    }

    @Override
    public int calcPoblacion(){
        int cantPob = 0;
        for (Provincia prov:Provincias){
            prov.calcPoblacion();
            cantPob = cantPob + prov.calcPoblacion();
        }
        return cantPob;
    }
}
