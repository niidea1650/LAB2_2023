package u4.ej3;

public enum colores {
    ROJO("#FF0000"),
    NARANJA("#FF0001"),
    VERDE("#FF0002"),
    MARRON("#FF0003"),
    AZUL("#FF0004"),
    VIOLETA ("#FF0005");


    private String codigoHexadecimal;

    private colores(String codigoHexadecimal) {
        this.codigoHexadecimal = codigoHexadecimal;
    }

    public String getCodigoHexadecimal() {
        return codigoHexadecimal;
    }


}
