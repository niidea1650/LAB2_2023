package u6.ej2;

public class Gato extends Mascotas{
    public Gato(String nombre, String duenio) {
        super(nombre, duenio,"Miau", Tipo.GATO);
    }
    private int alegria;

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }


    @Override
    void saludo(boolean esDuenio) {
        if(esDuenio) {
            System.out.print("Miau");
        }else{
            System.out.print("MIAU!");
        }
    }

    @Override
    void alimentar() {
        alegria = alegria + 1;
    }

    @Override
    void alegria() {
        for (int i = 0; i < alegria; i++ ){
            saludo(true);
            System.out.print(", ");
        }
    }
}
