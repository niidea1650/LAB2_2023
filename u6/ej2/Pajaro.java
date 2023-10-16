package u6.ej2;


public class Pajaro extends Mascotas{
    private boolean cantor;
    private Integer alegria = 0;

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public Integer getAlegria() {
        return alegria;
    }

    public void setAlegria(Integer alegria) {
        this.alegria = alegria;
    }

    public Pajaro(String nombre, String duenio, boolean cantor) {
        super(nombre, duenio,"pio", Tipo.PAJARO);
        this.cantor = cantor;
    }

    public void canto(){
        if (cantor == true){
            System.out.println("pipipipipio");
        }else{
            System.out.println("pio");
        }
    }
    @Override
    void saludo(boolean esDuenio) {
        if(esDuenio) {
            canto();
        }else{
            System.out.println("...");
        }
    }
    void alimentar() {
        alegria = alegria + 1;
    }

    @Override
    void alegria() {
        for (int i=0; i < alegria; i++ ){
            saludo(true);
            System.out.print(", ");
        }
    }
}
