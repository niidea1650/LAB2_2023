package u7.ej4;

import java.util.ArrayList;

class Autor {
    private String nombre;
    private String fechaNacimiento;
    private String dni;
    private ArrayList<LibroElectronico> bibliografia;

    public Autor(String nombre, String fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.bibliografia = new ArrayList<>();
    }

    public void agregarLibro(LibroElectronico libro) {
        bibliografia.add(libro);
    }
}
