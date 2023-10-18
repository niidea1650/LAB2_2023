package u3.ej1;

import u1.ej3.Color;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("ABC123", true);
        Camioneta camioneta1 = new Camioneta("Toyota", "Hilux", 2023, u1.ej3.Color.AZUL, 4, "XYZ456", 1000, 500);
        Auto auto2 = new Auto("Honda", "Civic", 2022, u1.ej3.Color.AMARILLO, 4, "DEF789", false);
        Camioneta camioneta2 = new Camioneta("Ford", "Ranger", 2023, Color.BLANCO, 4, "GHI012", 800, 400);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(auto1);
        vehiculos.add(camioneta1);
        vehiculos.add(auto2);
        vehiculos.add(camioneta2);

        Empresa empresa = new Empresa(vehiculos);

        empresa.masCantidad();
        double porcentajeDescapotables = empresa.porcentajeDescapotables();
        System.out.println("Porcentaje de autos descapotables: " + porcentajeDescapotables);
    }
}

