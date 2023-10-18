package u3.ej1;

import u1.ej3.Color;

class Auto extends Vehiculo {
    private String patente;
    private boolean descapotable;

    public Auto(String patente, boolean descapotable) {
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public Auto(String marca, String modelo, int año, Color color, int cant_ruedas, String patente, boolean descapotable) {
        super(marca, modelo, año, color, cant_ruedas);
        this.patente = patente;
        this.descapotable = descapotable;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void Esdescapotable(Boolean descapotable){
        if (descapotable){
            System.out.println("es descapotable");
        }
        else {
            System.out.println("no es descapotable");
        }
    }
}
