package u8.ej4;

import java.time.LocalDate;
import java.util.HashSet;

public class Arquero extends Jugador implements Contrato{
    private int atajadas_por;
    private int goles_res;
    private int patean;

    public int getAtajadas_por() {
        return atajadas_por;
    }

    public void setAtajadas_por(int atajadas_por) {
        this.atajadas_por = atajadas_por;
    }

    public int getGoles_res() {
        return goles_res;
    }

    public void setGoles_res(int goles_res) {
        this.goles_res = goles_res;
    }

    public int getPatean() {
        return patean;
    }

    public void setPatean(int patean) {
        this.patean = patean;
    }

    public Arquero(String nombre, int edad, LocalDate fecha_nacimiento, String posición, provincias provincia, HashSet<Equipo> equipos, Equipo equipo_actual, int camiseta, int atajadas_por, int goles_res, int patean) {
        super(nombre, edad, fecha_nacimiento, posición, provincia, equipos, equipo_actual, camiseta);
        this.atajadas_por = atajadas_por;
        this.goles_res = goles_res;
        this.patean = patean;
    }

    public void verifica_edad()throws EdadException{
        if ( this.getEdad() > 35 ) {
            throw new EdadException("no se encuentra entre las edades posibles ");
        }
    }
    public void verifica_equipo( Equipo equipo)throws EquipoException{
        if (this.getEquipo_actual().getNombre() == equipo.getNombre() ){
            throw new EquipoException("no puede se contratado por el equipo que pertenece");
        }
    }
    public int porcentaje_recividos(){
        return this.getPatean()/ this.goles_res;
    }
    public int re(){
        return this.atajadas_por;
    }

    @Override
    public void contratar(Equipo equipo){
        try {
            verifica_edad();
            verifica_equipo(equipo);
            System.out.println( this.getNombre() + this.toString() + "se contrato en el " + equipo.getNombre() );
        }
        catch (EdadException e){
            System.out.println(e.getMessage());
        }
        catch (EquipoException eq){
            System.out.println(eq.getMessage());
        }
    }

    @Override
    public void renovar(Equipo equipo) {
        try {
            verifica_edad();
            verifica_equipo(equipo);
            System.out.println( this.getNombre() + this.toString() + "renovó con el  " + equipo.getNombre());
        }
        catch (EdadException e){
            System.out.println(e.getMessage());
        }
        catch (EquipoException eq){
            System.out.println(eq.getMessage());
        }
    }
}
