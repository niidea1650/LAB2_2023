package u8.ej5;

import com.sun.corba.se.spi.activation.ActivatorHelper;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Martin", "Barbieri",20, LocalDate.of(2003,01,27),true);
        Chef cheff = new Chef("Nahuel", "Genovesi",20, LocalDate.of(2003,01,27),false);
        Chef chefff = new Chef("ian", "simoes",16, LocalDate.of(2003,01,27),true);
        HashSet<Chef> chefcitos = new HashSet<>();
        chefcitos.add(chef);
        Plato plato = new Plato("Barwock","wock de vegetales ",2500,Tipo.PLATO_PRINCIPAL,chef);
        Plato platoo = new Plato("barhamburger"," hamburguesa INCREIBLE ",3000,Tipo.PLATO_PRINCIPAL,cheff);
        Plato platooo = new Plato("Barwock","wock de vegetales ",2500,Tipo.PLATO_PRINCIPAL,chef);
        HashSet<Plato> platoss = new HashSet<>();
        platoss.add(plato);
        Menu menu = new Menu(platoss);
        Restaurante restaurante = new Restaurante("MC",chefcitos,menu);
            restaurante.contratar(chef);
            restaurante.contratar(cheff);
            restaurante.contratar(chefff);
            restaurante.AgregarPlato(plato);
            restaurante.AgregarPlato(platoo);
            restaurante.AgregarPlato(platooo);
    }
}
