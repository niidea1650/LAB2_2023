package u7.ej1;

public class Main2 {
    public static void main(String[] args) {
        String nombre = null;
        try{
            if (nombre == null){
                throw new NullPointerException("error nombre = null");
            }
            System.out.println("El largo del nombre es:" + nombre.length());
        }catch (NullPointerException e){
            System.out.println("error " + e.getMessage());
        }
    }
}
