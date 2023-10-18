package u1.ej6;

import u1.ej5.Fecha;
import u4.ej1.Editorial;

public class Libro {
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int cantidadPaginas;
    private Editorial editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, Persona autor, String ISBN, int cantidadPaginas, Editorial editorial, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidadPaginas = cantidadPaginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro(String titulo, Persona autor, String ISBN, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidadPaginas = 0;
        this.editorial = Editorial.ALIANZA;
        this.fechaPublicacion = fechaPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public boolean esAnteriorA(Libro otroLibro) {
        return this.fechaPublicacion.menorQue(otroLibro.fechaPublicacion);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", ISBN='" + ISBN + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                ", editorial='" + editorial + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                '}';
    }
}

