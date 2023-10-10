package u8.ej5;

import java.util.HashSet;

public class Menu {
    private HashSet<Plato> menu;

    public Menu(HashSet<Plato> menu) {
        this.menu = menu;
    }

    public HashSet<Plato> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<Plato> menu) {
        this.menu = menu;
    }
}
