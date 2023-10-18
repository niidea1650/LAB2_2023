package u3.ej1;

import u1.ej3.Color;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private Color color;
    private int cant_ruedas;

    public Vehiculo() {
        this.marca = "Ford";
        this.modelo = "Mustang";
        this.año = 2023;
        this.color = Color.AZUL;
        this.cant_ruedas = 4;

    }

    public Vehiculo(String marca, String modelo, int año, Color color, int cant_ruedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.cant_ruedas = cant_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }
}

