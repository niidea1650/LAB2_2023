package u8.ej4;

import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Partido> partidos;

    public Sistema(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }

    public Sistema() {
        this.partidos = new HashSet<>();
    }

    public HashSet<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }
    public void SumarGoles (Jug_cancha jugador, Partido p){
        for (Map.Entry<Jug_cancha, Integer> goless : p.getGolesp().entrySet()) {
            goless.getKey().setGoles(goless.getKey().getGoles() + goless.getValue());
        }
    }
    public void SumarAsistencias (Jug_cancha jugador, Partido p){
        for (Map.Entry<Jug_cancha, Integer> asistenciass : p.getAsistenciasp().entrySet()) {
            asistenciass.getKey().setAsistencias(asistenciass.getKey().getAsistencias() + asistenciass.getValue());
        }
    }
    public void SumaPatea (Arquero juan, Partido a){
        for (Map.Entry<Arquero, Integer> pateann : a.getPateanp().entrySet()) {
            pateann.getKey().setPatean(pateann.getKey().getPatean() + pateann.getValue());
        }
    }
    public void Suma_goles_recividos (Arquero juan, Partido a){
        for (Map.Entry<Arquero, Integer> recevidoss : a.getRecp().entrySet()) {
            recevidoss.getKey().setGoles_res(recevidoss.getKey().getGoles_res() + recevidoss.getValue());
        }
    }
    public void Suma_Atajadas (Arquero juan, Partido a){
        for (Map.Entry<Arquero, Integer> atajadass : a.getAtajadas().entrySet()) {
            atajadass.getKey().setAtajadas_por(atajadass.getKey().getAtajadas_por() + atajadass.getValue());
        }
    }
}
