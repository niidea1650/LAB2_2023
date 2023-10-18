package u2.ej4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona autor1 = new Persona("Autor1", 30);
        Persona autor2 = new Persona("Autor2", 25);
        Cancion cancion1 = new Cancion("Cancion1", autor1);
        Cancion cancion2 = new Cancion("Cancion2", autor2);
        Cancion cancion3 = new Cancion("Cancion3", autor1);
        ArrayList<Cancion> canciones = new ArrayList<>();
        canciones.add(cancion1);
        canciones.add(cancion2);
        CD miCD = new CD(canciones, "Mi CD");
        System.out.println("Número de canciones en el CD: " + miCD.getCanciones().size());
        Cancion nuevaCancion = new Cancion("Nueva Cancion", autor2);
        miCD.agregaCancion(nuevaCancion);
        int posicionCancion = 2;
        if (posicionCancion >= 0 && posicionCancion < miCD.getCanciones().size()) {
            miCD.verCancion(posicionCancion);
        } else {
            System.out.println("La posición de la canción no es válida.");
        }
        int posicionEliminar = 2;
        if (posicionEliminar >= 0 && posicionEliminar < miCD.getCanciones().size()) {
            miCD.elimina(posicionEliminar);
            System.out.println("Canción eliminada. Número de canciones en el CD: " + miCD.getCanciones().size());
        } else {
            System.out.println("La posición de la canción a eliminar no es válida.");
        }
    }
}

