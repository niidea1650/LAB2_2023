package u8.ej5;

import u8.ej4.EdadException;

import java.util.HashSet;

public class Restaurante implements Contratar,Agregar {
    private String nombre;
    private HashSet<Chef> chefs;
    private Menu menu;

    public Restaurante(String nombre, HashSet<Chef> chefs, Menu menu) {
        this.nombre = nombre;
        this.chefs = chefs;
        this.menu = menu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Chef> getChefs() {
        return chefs;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }

    public void verifica_edad(Chef chef) throws EdadException {
        if (chef.getEdad() <= 18) {
            throw new EdadException("no se encuentra entre las edades contratables ");
        }
    }

    public void verificar_exp(Chef chef) throws ExpException {
        if (chef.getExperiencia() == false
        ) {
            throw new ExpException("no tiene la suficiente experiencia");
        }
    }
    public void verificar_plato(Plato plato) throws PlatoException{
        if (!menu.getMenu().contains(plato))
                throw new PlatoException ("El plato ya se encuentra en el menu");
            }
    public void verificar_chef(Plato plato)throws ChefException{
        if (!chefs.contains(plato.getCreador())){
            throw new ChefException ("El chef no se encunetra en el equipo del restaurante");
        }
    }

    @Override
    public void contratar(Chef chef){
        try {
            verifica_edad(chef);
            verificar_exp(chef);
            System.out.println("El chef " + chef.getNombre() + " se unió al equipo de" + this.nombre);

        } catch (EdadException e) {
            System.out.println(e.getMessage());
        }catch (ExpException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void AgregarPlato(Plato plato) {
        try {
            verificar_chef(plato);
            verificar_plato(plato);
            System.out.println(" El plato " + plato.getNombre() +" se agregó al menú de " + this.nombre + ".");
        } catch (PlatoException ep){
            System.out.println(ep.getMessage());
        }catch (ChefException ec){
            System.out.println(ec.getMessage());
        }
    }
}
