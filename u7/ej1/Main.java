package u7.ej1;

public class Main{
    public static void main(String[] args) {
        String nombre = null;
        try {
            System.out.println("El largo del nombre es:" + nombre.length());
        }catch (NullPointerException e) {
            System.out.println("error el nombre es = null");
        }
    }
}