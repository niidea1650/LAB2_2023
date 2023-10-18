package u3.ej4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sensor>sensores = new ArrayList<>();
        sensores.add(new Humo());
        sensores.add(new Presion());
        sensores.add(new Temperatura());
        Alarma alarma = new Alarma(sensores);
        alarma.Bomberos();
        alarma.presionAlta();
        alarma.temperaturaAlta();
        try {
            alarma.moreInfo(-5);
        }catch (AlcanceException e){
            System.out.println(e.getMessage());
        }
        try {
            alarma.moreInfo(10);
        }catch (AlcanceException e){
            System.out.println(e.getMessage());
        }
        try {
            alarma.moreInfo(1);
        }catch (AlcanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("todo lindo :)");
    }
}
