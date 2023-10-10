package u8.ej2;

import java.time.LocalDate;

public class Examen {
    private LocalDate fechaRealizacion;
    private Escrito escrito;
    private Oral oral;

    public Examen(LocalDate fechaRealizacion, Escrito escrito, Oral oral) {
        this.fechaRealizacion = fechaRealizacion;
        this.escrito = escrito;
        this.oral = oral;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Escrito getEscrito() {
        return escrito;
    }

    public void setEscrito(Escrito escrito) {
        this.escrito = escrito;
    }

    public Oral getOral() {
        return oral;
    }

    public void setOral(Oral oral) {
        this.oral = oral;
    }
}
