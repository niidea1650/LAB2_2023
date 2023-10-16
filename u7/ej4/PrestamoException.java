package u7.ej4;

public class PrestamoException extends Exception{
    public PrestamoException() {
        super("Has alcanzado el límite de préstamos.");
    }
}
