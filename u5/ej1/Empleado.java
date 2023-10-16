package u5.ej1;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Date;
import java.util.HashSet;

public class Empleado extends Persona{
    private HashSet<Semana> dias_habiles;
    private HashSet<LocalDateTime> asistencia;
    private double diasAsistidos;

    public Empleado(String nombre, String apellido, int telefono, Date f_nacimiento,double diasAsistidos, HashSet<Semana> dias_habiles, HashSet<Semana> dias_habiles1, HashSet<LocalDateTime> asistencia) {
        super(nombre, apellido, telefono, f_nacimiento, dias_habiles);
        this.dias_habiles = dias_habiles1;
        this.asistencia = asistencia;
        this.diasAsistidos = diasAsistidos;
    }

    public HashSet<Semana> getDias_habiles() {
        return dias_habiles;
    }

    public void setDias_habiles(HashSet<Semana> dias_habiles) {
        this.dias_habiles = dias_habiles;
    }

    public HashSet<LocalDateTime> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashSet<LocalDateTime> asistencia) {
        this.asistencia = asistencia;
    }

    public double getDiasAsistidos() {
        return diasAsistidos;
    }

    public void setDiasAsistidos(double diasAsistidos) {
        this.diasAsistidos = diasAsistidos;
    }

    public void RegistroIngreso(){
        LocalDateTime ingreso = LocalDateTime.now();
        asistencia.add(ingreso);
    }

    public void calcularPorcentajeAsistencia(int mes, int anio) {
        int diasEnElMes = YearMonth.of(anio, mes).lengthOfMonth();
        for (LocalDateTime asistencia : asistencia) {
            if (asistencia.getMonthValue() == mes && asistencia.getYear() == anio) {
                diasAsistidos++;
            }
        }
            diasAsistidos = (double) (diasAsistidos / diasEnElMes * 100.0);
    }

}

