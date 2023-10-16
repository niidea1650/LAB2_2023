package u7.ej3;

public abstract class Componente {
    private String nombreFabricante;
    private String modelo;
    private float precio;
    private int numeroDeSerie;

    public Componente(String nombreFabricante, String modelo, float precio, int numeroDeSerie) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.numeroDeSerie = numeroDeSerie;
    }

    public Componente(){
        nombreFabricante = "Samsung";
        modelo = "55p 4k QLED";
        precio = 534000.0f;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public abstract int getStock();
    public abstract void bajarStock();

    @Override
    public String toString() {
        return "Componente{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}

