package u7.ej1;

public class Main3 {
    public static void main(String[] args) {
        String nombre = null;
        try {
            LargoNombre(nombre);
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
    public static void LargoNombre(String nombre) throws NullPointerException{
        if (nombre == null){
            throw  new NullPointerException("nombre = null");
        }
        System.out.println("El largo del nombre es:" + nombre.length());
    }
}
