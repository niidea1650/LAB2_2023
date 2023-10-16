package u5.ej1;

import java.util.HashSet;

public class Sistema {
    private HashSet<Empleado> empleados;
    private HashSet<Empleado> empleados80;

    public Sistema(HashSet<Empleado> empleados, HashSet<Empleado> empleados80) {
        this.empleados = empleados;
        this.empleados80 = empleados80;
    }

    public Sistema(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public HashSet<Empleado> getEmpleados80() {
        return empleados80;
    }

    public void setEmpleados80(HashSet<Empleado> empleados80) {
        this.empleados80 = empleados80;
    }

    public void Empleados80(){
        for (Empleado empleado : empleados){
            if (empleado.getDiasAsistidos() <= 80 ){
                empleados80.add(empleado);
            }
        }
    }
}
