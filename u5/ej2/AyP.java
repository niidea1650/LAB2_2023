package u5;

import u5.ej2.Persona;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AyP extends Persona {
    private HashMap<Date, Float> altura = new HashMap<Date, Float>();
    private HashMap<Date, Float> peso = new HashMap<Date, Float>();

    public AyP(String nombre, String apellido, int telefono, Date f_nacimiento) {
        super(nombre, apellido, telefono, f_nacimiento);
    }

    public void setAltura(HashMap<Date, Float> altura) {
        this.altura = altura;
    }

    public void setPeso(HashMap<Date, Float> peso) {
        this.peso = peso;
    }

    public Float promedioAltura(int anio) {
        Float suma = 0f;
        int cont = 0;
        for (Map.Entry<Date, Float> altura : altura.entrySet()) {
            if (altura.getKey().getYear() == anio) {
                suma = altura.getValue() + suma;
                cont++;
            }
        }
        return suma / cont;
    }

    public Float promedioPeso(int anio) {
        Float suma = 0f;
        int cont = 0;
        for (Map.Entry<Date, Float> peso : peso.entrySet()) {
            if (peso.getKey().getYear() == anio) {
                suma = peso.getValue() + suma;
                cont++;
            }
        }
        return suma / cont;
    }

    public Float cambioA(int anio1, int anio2) {
        Float max1 = 0f;
        Float max2 = 0f;
        int cont = 0;
        for (Map.Entry<Date, Float> altura : altura.entrySet()) {
            if (altura.getKey().getYear() == anio1) {
                if (altura.getValue() > max1) {
                    max1 = altura.getValue();
                }
            }
        }
        for (Map.Entry<Date, Float> altura : altura.entrySet()) {
            if (altura.getKey().getYear() == anio2) {
                if (altura.getValue() > max2) {
                    max2 = altura.getValue();
                }
            }
        }
        return (max2 - max1);
    }
}
