package u8.ej4;

import java.time.LocalDate;
import java.util.HashSet;

public class Jug_cancha extends Jugador implements Contrato{
    private int goles;
    private int asistencias;


    public Jug_cancha(String nombre, int edad, LocalDate fecha_nacimiento, String posición, provincias provincia, HashSet<Equipo> equipos, Equipo equipo_actual, int camiseta, int goles, int asistencias) {
        super(nombre, edad, fecha_nacimiento, posición, provincia, equipos, equipo_actual, camiseta);
        this.goles = goles;
        this.asistencias = asistencias;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public void verifica_edad()throws EdadException{
        if ( this.getEdad() > 35 ) {
            throw new EdadException("no se encuentra entre las edades posibles ");
        }
    }
    public void verifica_equipo(Equipo equipo)throws EquipoException{
        if (this.getEquipo_actual().getNombre() == equipo.getNombre() ){
            throw new EquipoException("no puede se contratado por el equipo que pertenece");
        }
    }
    public int porcentaje_goles(){
        return super.getPartidos_jugados().size() / this.goles;
    }
    public int cant_asistencias(){
        return this.asistencias;
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
