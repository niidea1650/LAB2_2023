package u7.ej1;

public class Main4 {
    String nombre = null;
    public static void main(String[] args) {

    }
    public void Verificar_largo()throws NombreException{
        if ( nombre == null){
            throw new NombreException("error el nombre es = null");
        }
    }
    public void ejecutar(){
        try{
            Verificar_largo();
        } catch (NombreException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("El largo del nombre es:" + nombre.length());
    }
}
