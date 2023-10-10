package u8.ej1;

public abstract class Ropa implements Prestar{
    private String color;
    private Material material;
    private String marca;
    private Estado estado;



    public Ropa(String color, Material material, String marca, Estado estado) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public abstract String caracteristicas();

    @Override
    public boolean prestar() {
        boolean presta;
        if(this.estado == Estado.MANCHADO || this.estado == Estado.ROTO){
            System.out.println("La prenda no se prestara");
            presta = false;
        } else {
            System.out.println("La prenda no se prestara");
            presta = true;
        }
        return presta;
    }
}
