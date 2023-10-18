package u3.ej2;
import utilidades.Persona;
public class Pedido {
    private Fecha fechaCreacion;
    private Plato plato;
    private Persona persona;
    private String horaEntrega;
    private boolean entregado;

    public Pedido(Fecha fechaCreacion, Plato plato, Persona persona, String horaEntrega, boolean entregado) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }
    public Pedido(){
        fechaCreacion = new Fecha(11,4,2023);
        plato = new Plato();
        persona = new Alumno();
        horaEntrega = "12:30";
        entregado = false;
    }
    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public void CalcularPrecio(){
        if(persona instanceof Profesor) {
            Profesor profesor = (Profesor)persona;
            if (profesor.getDescuento() > 0) {
                System.out.println("Precio con descuento" + (plato.getPrecio() - plato.getPrecio() * (profesor.getDescuento() / 100)));
            }
        }else {
            System.out.println("Precio: " + plato.getPrecio());
        }
    }
}
