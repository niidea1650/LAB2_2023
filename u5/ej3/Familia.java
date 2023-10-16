package u5.ej3;

import java.util.Date;
import java.util.HashSet;

public class Familia extends Familiar {

    HashSet<Familiar> familias = new HashSet<Familiar>();

    public Familia(String nombre, String apellido, int telefono, Date fecha, HashSet<Familiar> familias) {
        super(nombre, apellido, telefono, fecha);
        this.familias = familias;
    }

    public HashSet<Familiar> getFamilias() {
        return familias;
    }

    public void setFamilias(HashSet<Familiar> familias) {
        this.familias = familias;
    }

    public Float promC (){
        Float sumaT = 0f;
        for (Familiar familiar: familias) {
            sumaT = familiar.cantCalorias() + sumaT;
        }
        return sumaT / familias.size();
    }

    public int masCalorias(){
        int maxC = 0;
        for (Familiar familiar : familias){
            if (familiar.cantCalorias() > maxC){
                maxC = familiar.cantCalorias();
            }
        }
        return maxC;
    }

    public int menosCalorias(){
        int minC = -1;
        for (Familiar familiar : familias){
            if (minC == -1 || familiar.cantCalorias() < minC){
                minC = familiar.cantCalorias();
            }
        }
        return minC;
    }
}