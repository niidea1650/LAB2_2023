package u8.ej1;

import java.util.HashSet;

public abstract class Objeto implements Prestar{
    HashSet<Ropa>prendas;
    HashSet<Libro>libros;
    HashSet<Revista>revistas;

    public Objeto(HashSet<Ropa> prendas, HashSet<Libro> libros, HashSet<Revista> revistas) {
        this.prendas = prendas;
        this.libros = libros;
        this.revistas = revistas;
    }

    public HashSet<Ropa> getPrendas() {
        return prendas;
    }

    public void setPrendas(HashSet<Ropa> prendas) {
        this.prendas = prendas;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public HashSet<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(HashSet<Revista> revistas) {
        this.revistas = revistas;
    }

    @Override
    public boolean prestar() {
        return false;
    }

}
