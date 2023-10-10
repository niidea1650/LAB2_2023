package u8.ej3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Partido partido = new Partido("a", 123, 44);
        Paloma p = new Paloma("negro", "a", true, "Paloma");
        TelefonoMovil t = new TelefonoMovil(345, "vos", "nash", Compania.TUENTI, 123345, true, 22);
        Trabajador tr = new Trabajador("nom", "bre", 123456678, LocalDate.of(1990, 9, 1), 123, 400000, 1234, LocalTime.ofNanoOfDay(3), LocalTime.ofSecondOfDay(7));

        p.hacerCampaña();
        t.hacerCampaña();
        tr.hacerCampaña();



    }
}
