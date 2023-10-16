package u6.ej2;


import java.util.Collection;
import java.util.HashSet;

public class Sistema {
    HashSet<Mascotas> mascota = new HashSet<Mascotas>();

    public HashSet<Mascotas> getMascota() {
        return mascota;
    }

    public void setMascota(HashSet<Mascotas> mascota) {
        this.mascota = mascota;
    }

    public void saludar (Mascotas mascota, String duenio){
        boolean saludarr = true;
        if(mascota.getDuenio() == duenio ) {
            saludarr = true;
            mascota.saludo(saludarr);
            if(mascota.getTipo() == Tipo.PEZ && ((Peces)mascota).getVida() == 1){
                this.mascota.remove(mascota);
            }
        }else if(mascota.getTipo() == Tipo.PEZ){
            saludarr = false;
            this.mascota.remove(mascota);
        }else{
            saludarr = false;
            mascota.saludo(saludarr);
        }
    }
}
