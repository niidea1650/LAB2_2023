package u3.ej2;

import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia = 15;
        this.mes = 3;
        this.anio = 2023;
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void valida(){
        if(dia > 28 && mes == 2 && anio%4 != 0){
            dia = 1;
        }
        if(dia > 28 && mes == 2 && anio%4 == 0){
            dia = 1;
        }
        if((dia > 30 && mes == 4) || (dia > 30 && mes == 6) || (dia > 30 && mes == 9) || (dia > 30 && mes == 11)){
            dia = 1;
        }
        if(dia < 1 || dia > 31){
            dia = 1;
        }
        if(mes < 0 || mes > 12 ){
            mes = 1;
        }
        if(anio < 1 || anio > 2100){
            anio = 1900;
        }
    }

    public void validaCorrige(){
        if(dia > 28 && mes == 2 && anio%4 != 0){
            dia = 1;
            mes += 1;
        }
        if(dia > 29 && mes == 2 && anio%4 == 0){
            dia = 1;
            mes += 1;
        }
        if((dia > 30 && mes == 4) || (dia > 30 && mes == 6) || (dia > 30 && mes == 9) || (dia > 30 && mes == 11)){
            dia = 1;
            mes += 1;
        }
        if(dia > 31){
            dia = 1;
            mes += 1;
        }
        if(dia < 1){
            mes -= 1;
            if(mes == 4|| mes == 6 || mes == 9 || mes == 11){
                dia = 30;
            } else if (mes == 2) {
                if(anio%4!=0) {
                    dia = 28;
                }
                else{
                    dia = 29;
                }
            }else{
                dia = 31;
            }
        }
        if( mes > 12 ){
            mes = 1;
            anio += 1;
        }
        if(mes < 1){
            anio -= 1;
            mes = 12;
        }
        if(anio < 1 || anio > 2100){
            anio = 1900;
        }
    }
    public void diaMes(int mes){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("dias: 31");
        }else if(mes == 2){
            System.out.println("Dias: 28");
        }else{
            System.out.println("Dias: 30");
        }
    }

    public void corta(){
        System.out.println(dia +"-"+mes+"-"+anio);
    }

    public void larga(){
        Date date = new Date(anio , mes-1, dia-1);
        System.out.println(date.getDay());
        switch (date.getDay()){
            case 0:
                System.out.print("Domingo " + dia);
                break;
            case 1:
                System.out.print("Lunes " + dia);
                break;
            case 2:
                System.out.print("Martes " + dia);
                break;
            case 3:
                System.out.print("Miercoles " + dia);
                break;
            case 4:
                System.out.print("Jueves " + dia);
                break;
            case 5:
                System.out.print("Viernes " + dia);
                break;
            case 6:
                System.out.print("Sabado " + dia);
                break;
        }
        switch (mes){
            case 1:
                System.out.println(" Enero de " + anio);
                break;
            case 2:
                System.out.println(" Febrero de " + anio);
                break;
            case 3:
                System.out.println(" Marzo de " + anio);
                break;
            case 4:
                System.out.println(" Abril de " + anio);
                break;
            case 5:
                System.out.println(" Mayo de " + anio);
                break;
            case 6:
                System.out.println(" Junio de " + anio);
                break;
            case 7:
                System.out.println(" Julio de " + anio);
                break;
            case 8:
                System.out.println(" Agosto de " + anio);
                break;
            case 9:
                System.out.println(" Septiembre de " + anio);
                break;
            case 10:
                System.out.println(" Octubre de " + anio);
                break;
            case 11:
                System.out.println(" Noviembre de " + anio);
                break;
            case 12:
                System.out.println(" Diciembre de " + anio);
                break;
        }
    }

    public void siguiente(){
        dia += 1;
        validaCorrige();
    }
    public void anterior(){
        dia -= 1;
        validaCorrige();
    }

    public boolean igualQue(Fecha fecha){
        if(this.dia == fecha.dia && this.mes == fecha.mes && this.anio == fecha.anio){
            return true;
        }
        return false;
    }

    public boolean mayorQue(Fecha fecha) {
        if (this.anio > fecha.anio){
            return true;
        }
        if(this.anio == fecha.anio && this.mes > fecha.mes){
            return true;
        }
        if(this.anio == fecha.anio && this.mes == fecha.mes && this.dia > fecha.dia ){
            return true;
        }
        return false;
    }

    public boolean menorQue(Fecha fecha) {
        if (this.anio < fecha.anio){
            return true;
        }
        if(this.anio == fecha.anio && this.mes < fecha.mes){
            return true;
        }
        if(this.anio == fecha.anio && this.mes == fecha.mes && this.dia < fecha.dia ){
            return true;
        }
        return false;
    }
}
