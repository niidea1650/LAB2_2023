package u7.ej3;

public class Tarjeta {
    private int numero;
    private String banco;
    private String metodoPago;

    public Tarjeta(int numero, String banco, String metodoPago) {
        this.numero = numero;
        this.banco = banco;
        this.metodoPago = metodoPago;
    }

    public Tarjeta(){
        numero = 656565656;
        banco = "VISA";
        metodoPago="Debito";

    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
