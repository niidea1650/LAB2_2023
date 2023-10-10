package u8.ej3;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private int direccion;
    private int afiliados;
    private HashSet<Menasje>listaMensajes;

    public Partido(String nombre, int direccion, int afiliados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.afiliados = afiliados;
        this.listaMensajes = listaMensajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(int afiliados) {
        this.afiliados = afiliados;
    }

    public HashSet<Menasje> getListaMensajes() {
        return listaMensajes;
    }

    public void setListaMensajes(HashSet<Menasje> listaMensajes) {
        this.listaMensajes = listaMensajes;
    }
    public void agregarLista(Menasje m){
        listaMensajes.add(m);
    }
}
