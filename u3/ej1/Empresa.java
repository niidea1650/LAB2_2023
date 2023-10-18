package u3.ej1;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo> vehiculos;

    public Empresa(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Empresa(){
        vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void masCantidad(){
        int cantCoches = 0, cantCamionetas = 0;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo instanceof Auto){
                cantCoches++;
            }
            else if(vehiculo instanceof Camioneta){
                cantCamionetas++;
            }
        }
        if(cantCamionetas > cantCoches){
            System.out.println("Hay mas camionetas que autos");
        }else if (cantCoches == cantCamionetas ){
            System.out.println("Hay la misma cantidad");
        }else {
            System.out.println("Hay mas autos");
        }
    }
    public double porcentajeDescapotables(){
        double cantDescapotables = 0;
        double cantCoches = 0;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo instanceof Auto){
                cantCoches++;
                Auto auto = (Auto) vehiculo;
                if(auto.isDescapotable()){
                    cantDescapotables++;
                }
            }
        }
        return cantCoches/cantDescapotables;
    }
}
