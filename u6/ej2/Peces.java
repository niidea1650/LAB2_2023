package u6.ej2;


public class Peces extends Mascotas{

    private int vida = 10;
    public Peces(String nombre, String duenio) {
        super(nombre, duenio, "Gluc", Tipo.PEZ);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    @Override
    void saludo(boolean esDuenio) {
        if(esDuenio) {
            vida = vida - 1;
            System.out.println("vida -1");
        }else{
            vida = 0;
            System.out.println("se te murio");
        }
    }
    @Override
    void alimentar() {
        vida = vida + 1;
    }

    @Override
    void alegria() {

    }

}