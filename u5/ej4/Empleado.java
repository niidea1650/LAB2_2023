package u5.ej4;

import java.util.HashMap;

public class Empleado {
    private int dni;
    private String pais;

    public Empleado(int dni, String pais) {
        this.dni = dni;
        this.pais = pais;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
