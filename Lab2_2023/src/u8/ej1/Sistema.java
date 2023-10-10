package u8.ej1;

import java.util.HashSet;

public class Sistema {
    HashSet<Objeto>objetos;

    public Sistema(HashSet<Objeto> objetos) {
        this.objetos = objetos;
    }

    public HashSet<Objeto> getObjetos() {
        return objetos;
    }


    public void setObjetos(HashSet<Objeto> objetos) {
        this.objetos = objetos;
    }

    public void agregarElemento(Objeto objeto) {
        if(objeto.prestar() == true){
            System.out.println("El articulo ingresado puede ingresar al circuito de prestamos");
            objetos.add(objeto);
        } else {
            System.out.println("El articulo ingresado no podra ingresar a nuestro sistema");
        }
    }
}
