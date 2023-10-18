package u3.ej2;

import utilidades.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona>personas = new ArrayList<>();
        personas.add(new Alumno());
        personas.add(new Alumno());
        personas.add(new Profesor());
        personas.add(new Profesor());
        ArrayList<Plato>platos = new ArrayList<>();
        platos.add(new Plato());
        platos.add(new Plato());
        ArrayList<Pedido>pedidos = new ArrayList<>();
        Bufet bufet = new Bufet(personas,platos,pedidos);
        bufet.Menu();
    }
}
