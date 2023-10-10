package u8.ej1;

import java.time.LocalDate;

public class Revista extends Leer implements Prestar{
    private LocalDate Publicado;

    public Revista(int codigo, String titulo, int anio_publicado, LocalDate Publicado) {
        super(codigo, titulo, anio_publicado);
        this.Publicado = Publicado;
    }


    public LocalDate getPublicado() {
        return Publicado;
    }

    public void setPublicado(LocalDate publicado) {
        Publicado = publicado;
    }

    @Override
    public boolean prestar() {
        boolean presta;
        LocalDate fechaHaceUnTrimestre = Publicado.minusMonths(3);
        if (Publicado.isAfter(fechaHaceUnTrimestre)) {
            System.out.println("La revista se dara prestada");
            presta = true;
        } else {
            System.out.println("La revista no se prestara");
            presta = false;
        }
        return presta;
    }
}
