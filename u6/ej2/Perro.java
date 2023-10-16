package u6.ej2;


public class Perro extends Mascotas{
    public Perro(String nombre, String duenio) {
        super(nombre,duenio,"Guau",Tipo.PERRO);
    }
    private int alegria = 0;

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    @Override
    void saludo(boolean esDuenio) {
        if(esDuenio) {
            System.out.print("Guau");
        }else{
            System.out.print("¡GUAU!");
        }
    }
    @Override
    void alimentar() {
        alegria = alegria + 1;
    }
    @Override
    void alegria() {
        for (int i=0; i < alegria; i++ ){
            saludo(true);
            System.out.print(" ");
        }
    }

}
