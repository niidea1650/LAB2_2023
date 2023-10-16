package u7.ej2;


import java.util.ArrayList;
import java.util.Scanner;

public class Alarma {
    ArrayList<Sensor>sensores;

    public Alarma() {
        this.sensores = new ArrayList<>();
    }

    public Alarma(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    public void Bomberos(){
        int cantDetectores = 0;
        int sumaDetectores = 0;
        for (Sensor detector : sensores){
            if(detector.isConectado()) {
                if(detector instanceof Humo) {
                    cantDetectores++;
                    sumaDetectores += detector.getMedida();
                }
            }
        }
        if ((sumaDetectores / cantDetectores) == 60) {
            System.out.println("0800 bomberos");
        }else{
            System.out.println("cool");
        }
    }
    public void temperaturaAlta (){
        int cantSensores = 0;
        int sumaSensores = 0;
        for (Sensor sensor : sensores){
            if(sensor.isConectado()) {
                if(sensor instanceof Temperatura) {
                    cantSensores++;
                    sumaSensores += sensor.getMedida();
                }
            }
        }
        if ((sumaSensores / cantSensores) == 40) {
            System.out.println("La temperatura esta excedida");
        }else{
            System.out.println("cool");
        }
    }
    public void presionAlta (){
        int cantSensores = 0;
        int sumaSensores = 0;
        for (Sensor sensor : sensores){
            if(sensor.isConectado()) {
                if(sensor instanceof Presion) {
                    cantSensores++;
                    sumaSensores += sensor.getMedida();
                }
            }
        }
        if ((sumaSensores / cantSensores) == 80) {
            System.out.println("La presion esta excedida");
        }else{
            System.out.println("cool");
        }
    }

    public void moreInfo(int numero) throws AlcanceException{
        if(sensores.size()-1 < numero){
            throw new AlcanceException("sensoressss");
        }else if(numero < 0){
            throw new AlcanceException("Numero menor que 0");
        }
        Sensor sensor = sensores.get(numero);
        System.out.println(sensor.info());
    }
}
