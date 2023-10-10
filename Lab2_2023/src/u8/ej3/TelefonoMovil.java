package u8.ej3;

import java.time.LocalTime;

public class TelefonoMovil implements Menasje{
    private int numeroSerie;
    private String fabricante;
    private String modelo;
    private Compania compania;
    private int numeroCelular;

    private boolean prendido;
    private int credito;

    public TelefonoMovil(int numeroSerie, String fabricante, String modelo, Compania compania, int numeroCelular, boolean prendido, int credito) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.compania = compania;
        this.numeroCelular = numeroCelular;
        this.credito = credito;
        this.prendido = prendido;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }


    @Override
    public void enviarMensaje(Partido partido) {
        if (this.prendido == true && this.credito > 0){
            System.out.println(partido);
        }else{
            System.out.println("no puede mandarlo");
        }
    }

    @Override
    public void hacerCampaña() {
        if(this.prendido == true && this.credito > 0){
            System.out.println("Conectando con la antena más cercana: Vote por el partido para un mejor futuro");
        }else{
            System.out.println("no puede");
        }
    }
}