package u7.ej4;

import java.util.ArrayList;

class Usuario {
    private String nombre;
    private String fechaNacimiento;
    private String dni;
    private String email;
    private ArrayList<LibroElectronico> librosPrestados;
    private String membresia;

    public Usuario(String nombre, String fechaNacimiento, String dni, String email, String membresia) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.email = email;
        this.librosPrestados = new ArrayList<>();
        this.membresia = membresia;
    }

    public void tomarPrestadoLibro(LibroElectronico libro) throws PrestamoException, MembresiaException {
        if (librosPrestados.size() >= obtenerLimitePrestamos()) {
            throw new PrestamoException();
        }

        librosPrestados.add(libro);
        libro.prestar();
    }

    public void devolverLibro(LibroElectronico libro) {
        librosPrestados.remove(libro);
        libro.devolver();
    }

    private int obtenerLimitePrestamos() {
        switch (membresia) {
            case "bronce":
                return 5;
            case "plata":
                return 15;
            case "oro":
                return 50;
            default:
                return 0;
        }
    }
}
