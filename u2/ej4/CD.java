package u2.ej4;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones;
    private String nombre;

    public CD(ArrayList<Cancion> canciones, String nombre) {
        this.canciones = canciones;
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void numeroCanciones(){
        int i = 0;
        for (Cancion c : canciones){
            i = i + 1;
        }
        System.out.println(i);
    }
    public void verCancion(int posicion){
        System.out.println(canciones.get(posicion));
    }
    public void grabaCancion(int posicion, Cancion nuevaCancion){
        canciones.set(posicion, nuevaCancion);
    }
    public void agregaCancion(Cancion cancion){
        canciones.add(cancion);
    }
    public void elimina(int posicion){
        canciones.remove(posicion);
    }
}