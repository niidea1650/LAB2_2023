package u8.ej4;

public interface Contrato {
    public void contratar(Equipo equipos) throws EdadException;
    public void renovar(Equipo equipo);
}
