package u7.ej4;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor 1", "01/01/1980", "12345");
        LibroElectronico libro1 = new LibroElectronico("Libro 1", autor1, "Ficción", "libro1.pdf", 10);
        Usuario usuario1 = new Usuario("Usuario 1", "02/02/1990", "67890", "usuario1@email.com", "oro");

        try {
            usuario1.tomarPrestadoLibro(libro1);
        } catch (PrestamoException e) {
            System.out.println(e.getMessage());
        } catch (MembresiaException e) {
            System.out.println(e.getMessage());
        }

        usuario1.devolverLibro(libro1);
    }
}
