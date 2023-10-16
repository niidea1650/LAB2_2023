package u5.ej5;

import java.util.HashSet;

public class lugar {
    private  String Nombre;
    private int codigo;

    HashSet<coordenadas> coordenada = new HashSet<coordenadas>();


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public HashSet<coordenadas> getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(HashSet<coordenadas> coordenada) {
        this.coordenada = coordenada;
    }

    public lugar(String nombre,int codigo, HashSet<coordenadas> coordenada) {
        Nombre = nombre;
        this.codigo = codigo;
        this.coordenada = coordenada;
    }

    public int calcPoblacion(){
        return 0;
    }
}
