package u8.ej4;

import java.time.LocalDate;
import java.util.HashSet;

public class Jugador {
   private String nombre;
   private int edad;
   private LocalDate fecha_nacimiento;
   private String posición;
   private provincias provincia;
   private HashSet<Equipo> equipos;
   private Equipo equipo_actual;
   private int camiseta;
   private HashSet<Partido> partidos_jugados;

   public Jugador() {
      this.equipos = new HashSet<>();
      this.partidos_jugados = new HashSet<>();
   }

   public Jugador(String nombre, int edad, LocalDate fecha_nacimiento, String posición, provincias provincia, HashSet<Equipo> equipos, Equipo equipo_actual, int camiseta) {
      this.nombre = nombre;
      this.edad = edad;
      this.fecha_nacimiento = fecha_nacimiento;
      this.posición = posición;
      this.provincia = provincia;
      this.equipos = equipos;
      this.equipo_actual = equipo_actual;
      this.camiseta = camiseta;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public LocalDate getFecha_nacimiento() {
      return fecha_nacimiento;
   }

   public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
      this.fecha_nacimiento = fecha_nacimiento;
   }

   public String getPosición() {
      return posición;
   }

   public void setPosición(String posición) {
      this.posición = posición;
   }

   public provincias getProvincia() {
      return provincia;
   }

   public void setProvincia(provincias provincia) {
      this.provincia = provincia;
   }

   public HashSet<Equipo> getEquipos() {
      return equipos;
   }

   public void setEquipos(HashSet<Equipo> equipos) {
      this.equipos = equipos;
   }

   public Equipo getEquipo_actual() {
      return equipo_actual;
   }

   public void setEquipo_actual(Equipo equipo_actual) {
      this.equipo_actual = equipo_actual;
   }

   public int getCamiseta() {
      return camiseta;
   }

   public void setCamiseta(int camiseta) {
      this.camiseta = camiseta;
   }

   public HashSet<Partido> getPartidos_jugados() {
      return partidos_jugados;
   }

   public void setPartidos_jugados(HashSet<Partido> partidos_jugados) {
      this.partidos_jugados = partidos_jugados;
   }

   @Override
   public String toString() {
      return "Jugador{" +
              "nombre='" + nombre + '\'' +
              ", fecha_nacimiento=" + fecha_nacimiento +
              ", posición='" + posición + '\'' +
              ", provincia=" + provincia +
              ", equipos=" + equipos +
              ", equipo_actual=" + equipo_actual +
              ", camiseta=" + camiseta +
              '}';
   }
}
