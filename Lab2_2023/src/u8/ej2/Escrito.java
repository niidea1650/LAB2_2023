package u8.ej2;

import java.time.LocalDateTime;

public class Escrito {
    private static LocalDateTime duracion = LocalDateTime.now();
    private int nota;

    public Escrito(LocalDateTime duracion, int nota) {
        this.duracion = duracion;
        this.nota = nota;
    }

    public LocalDateTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalDateTime duracion) {
        this.duracion = duracion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
