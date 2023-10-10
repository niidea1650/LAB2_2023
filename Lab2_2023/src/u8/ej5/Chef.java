package u8.ej5;

import java.time.LocalDate;

public class Chef extends Persona {
    private Boolean experiencia;

    public Chef(String nombre, String apellido, int edad, LocalDate fecha_n, Boolean experiencia) {
        super(nombre, apellido, edad, fecha_n);
        this.experiencia = experiencia;
    }

    public Boolean getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Boolean experiencia) {
        this.experiencia = experiencia;
    }


}
