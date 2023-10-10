package u8.ej4;

import java.util.HashMap;
import java.util.HashSet;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private HashMap<Jug_cancha, Integer> golesp;
    private HashMap<Jug_cancha, Integer> asistenciasp;
    private HashMap<Arquero, Integer> recp;
    private HashMap<Arquero, Integer> atajadasp;
    private HashMap<Arquero, Integer> pateanp;

    public Partido(Equipo local, Equipo visitante, HashMap<Jug_cancha, Integer> golesp, HashMap<Jug_cancha, Integer> asistenciasp, HashMap<Arquero, Integer> recp, HashMap<Arquero, Integer> atajadasp, HashMap<Arquero, Integer> pateanp) {
        this.local = local;
        this.visitante = visitante;
        this.golesp = golesp;
        this.asistenciasp = asistenciasp;
        this.recp = recp;
        this.atajadasp = atajadasp;
        this.pateanp = pateanp;
    }
    public HashMap<Jug_cancha, Integer> getGolesp() {
        return golesp;
    }

    public HashMap<Arquero, Integer> getAtajadasp() {
        return atajadasp;
    }

    public void setAtajadasp(HashMap<Arquero, Integer> atajadasp) {
        this.atajadasp = atajadasp;
    }

    public HashMap<Arquero, Integer> getPateanp() {
        return pateanp;
    }

    public void setPateanp(HashMap<Arquero, Integer> pateanp) {
        this.pateanp = pateanp;
    }

    public void setGolesp(HashMap<Jug_cancha, Integer> golesp) {
        this.golesp = golesp;
    }

    public HashMap<Jug_cancha, Integer> getAsistenciasp() {
        return asistenciasp;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public HashMap<Arquero, Integer> getRecp() {
        return recp;
    }

    public void setRecp(HashMap<Arquero, Integer> recp) {
        this.recp = recp;
    }

    public HashMap<Arquero, Integer> getAtajadas() {
        return atajadasp;
    }

    public void setAtajadas(HashMap<Arquero, Integer> atajadasp) {
        this.atajadasp = atajadasp;
    }

    public void setAsistenciasp(HashMap<Jug_cancha, Integer> asistenciasp) {
        this.asistenciasp = asistenciasp;
    }

}
