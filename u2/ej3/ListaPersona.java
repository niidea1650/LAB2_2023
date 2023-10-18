package u2.ej3;

import java.util.ArrayList;

public class ListaPersona {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 32));
        personas.add(new Persona("Carlos", 45));
        personas.add(new Persona("Ana", 28));
        personas.add(new Persona("Luisa", 55));
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println(persona.getNombre());
            }
        }
    }
}
