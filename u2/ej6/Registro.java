package u2.ej6;

import u1.ej5.Fecha;
import u3.ej5.Empleado;
import u3.ej5.Llamada;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Registro {
    private ArrayList<Llamada> llamadas;
    private ArrayList<Empleado>empleados;
    public Registro(ArrayList<Empleado> empleados) {
        llamadas = new ArrayList<>();
        this.empleados = empleados;
    }

    public Registro(){
        llamadas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public void llamadosPorEmpleado() {
        for (Empleado empleado : empleados){
            System.out.println(empleado.toString());
            for (Llamada llamada : llamadas){
                if(llamada.getOrigen().equals(empleado) || llamada.getDestino().equals(empleado)){
                    System.out.println(llamada.toString());
                }
            }
        }
    }

    public void realizarLlamada() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su DNI");
        long DNI = entrada.nextLong();
        System.out.println("Ingrese el numero que quiere llamar");
        long numero = entrada.nextLong();
        Empleado origen = null;
        Empleado destino = null;
        for(Empleado empleado : empleados){
            if(DNI == empleado.getDNI()){
                origen = empleado;
            }
            if(numero == empleado.getTelefono()){
                destino = empleado;
            }
        }
        if(origen == null || destino == null){
            System.out.println("No se encontraron los dos empleados");
            return;
        }
        System.out.println("Ingrese la fecha de hoy");
        Fecha fecha = new Fecha(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        System.out.println("Ingrese el tiempo de llamada");
        Date tiempo = new Date(entrada.nextInt(), entrada.nextInt(),entrada.nextInt());
        llamadas.add(new Llamada(origen,destino,fecha,tiempo));
        System.out.println("La llamada fue realizada con exito");
    }
}
