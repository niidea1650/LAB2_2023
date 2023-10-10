package u8.ej1;

import u8.ej1.Estado;
import u8.ej1.Material;
import u8.ej1.Ropa;

public class Campera extends Ropa {
    public Campera(String color, Material material, String marca, Estado estado) {
        super(color, material, marca, estado);
    }
    @Override
    public String caracteristicas() {
        return null;
    }
}
