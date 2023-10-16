package u5.ej3;

import java.util.ArrayList;
import java.util.Date;

public class Familiar extends Persona{
    private ArrayList<Platos> platosC;
    public Familiar(String nombre, String apellido, int telefono, Date fecha) {
        super(nombre, apellido, telefono, fecha);
        this.platosC = platosC;
    }

    public ArrayList<Platos> getPlatosC() {
        return platosC;
    }

    public void setPlatosC(ArrayList<Platos> platosC) {
        this.platosC = platosC;
    }

    public int cantCalorias(){
        int sumaC = 0;
        for (Platos platos: platosC) {
            sumaC = platos.getCalorias() + sumaC;
        }
        return sumaC;
    }
}
