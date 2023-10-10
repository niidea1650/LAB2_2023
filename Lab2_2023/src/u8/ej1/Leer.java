package u8.ej1;

import java.time.LocalDate;

public abstract class Leer {
    private int codigo;
    private String titulo;
    private int anio_publicado;

    public Leer(int codigo, String titulo, int anio_publicado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio_publicado = anio_publicado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio_publicado() {
        return anio_publicado;
    }

    public void setAnio_publicado(int anio_publicado) {
        this.anio_publicado = anio_publicado;
    }
}
