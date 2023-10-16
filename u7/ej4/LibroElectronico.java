package u7.ej4;

class LibroElectronico {
    private String titulo;
    private Autor autor;
    private String genero;
    private String archivoPdf;
    private int descargasDisponibles;

    public LibroElectronico(String titulo, Autor autor, String genero, String archivoPdf, int descargasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.archivoPdf = archivoPdf;
        this.descargasDisponibles = descargasDisponibles;
    }

    public void prestar() {
        if (descargasDisponibles > 0) {
            descargasDisponibles--;
        } else {
            System.out.println("No quedan descargas disponibles para este libro.");
        }
    }

    public void devolver() {
        descargasDisponibles++;
    }
}

