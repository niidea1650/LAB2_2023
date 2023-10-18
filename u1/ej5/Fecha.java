package u1.ej5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        valida(dia, mes, anio);
    }

    public void valida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1 || dia > diasMes(mes, anio)) {
            dia = 1;
        }
        if (anio < 1900) {
            anio = 1900;
        }

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    private int diasMes(int mes, int anio) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, 1);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public void corta() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(dateFormat.format(getFecha()));
    }

    public void larga() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
        System.out.println(dateFormat.format(getFecha()));
    }

    private Date getFecha() {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        return cal.getTime();
    }

    public void siguiente() {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        Date siguienteFecha = cal.getTime();
        dia = siguienteFecha.getDate();
        mes = siguienteFecha.getMonth() + 1;
        anio = siguienteFecha.getYear() + 1900;
    }

    public void anterior() {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date anteriorFecha = cal.getTime();
        dia = anteriorFecha.getDate();
        mes = anteriorFecha.getMonth() + 1;
        anio = anteriorFecha.getYear() + 1900;
    }

    public boolean igualQue(Fecha fecha) {
        return dia == fecha.dia && mes == fecha.mes && anio == fecha.anio;
    }

    public boolean menorQue(Fecha fecha) {
        if (anio < fecha.anio) {
            return true;
        } else if (anio == fecha.anio && mes < fecha.mes) {
            return true;
        } else if (anio == fecha.anio && mes == fecha.mes && dia < fecha.dia) {
            return true;
        }
        return false;
    }

    public boolean mayorQue(Fecha fecha) {
        if (anio > fecha.anio) {
            return true;
        } else if (anio == fecha.anio && mes > fecha.mes) {
            return true;
        } else if (anio == fecha.anio && mes == fecha.mes && dia > fecha.dia) {
            return true;
        }
        return false;
    }
}

