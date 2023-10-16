package u7.ej3;

import u5.ej1.Semana;

import java.util.HashSet;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        HashSet<Semana> diasHabiles = new HashSet<>(); // Asegúrate de inicializar esto correctamente
        Cliente cliente = new Cliente("Nombre", "Apellido", 123456789, new Date(), diasHabiles, 1234567890, "Pago", new Tarjeta());
        HashSet<Componente> componentes = new HashSet<>();
        Compu computadora = new Compu(componentes, cliente, 0);
       // try {

            //Componente componente1 = new Componente("Fabricante1", "Modelo1", 500.0f, 1);
            //Componente componente2 = new Componente("ff","www",23,1);

            //computadora.agregarComponente(componente1);
           // computadora.agregarComponente(componente2);
       // } catch (StockException e) {
      //      System.out.println("Error de stock: " + e.getMessage());
       // }
    }
}
