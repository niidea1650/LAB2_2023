package u0.ej3;

public class Semana {
    private boolean semana;

    public Semana(boolean semana) {
        this.semana = semana;
    }

    public boolean isSemana() {
        return semana;
    }

    public void setSemana(boolean semana) {
        this.semana = semana;
    }
    public void DiasLaborales(){
        if (semana == true){
            System.out.println("se trabaja");
        }if (semana == false){
            System.out.println("findeeee");
        }
    }
}
