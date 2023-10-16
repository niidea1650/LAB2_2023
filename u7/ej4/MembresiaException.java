package u7.ej4;

class MembresiaException extends Exception {
    public MembresiaException() {
        super("Has alcanzado el límite de préstamos para tu membresía.");
    }
}
