package u3.ej2;

import utilidades.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Bufet {
    private ArrayList<Persona>personas;
    private ArrayList<Plato>platos;
    private ArrayList<Pedido>pedidos;

    public Bufet(ArrayList<Persona> personas, ArrayList<Plato> platos, ArrayList<Pedido> pedidos) {
        this.personas = personas;
        this.platos = platos;
        this.pedidos = pedidos;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void Menu() {
        boolean salir = false;
        while (!salir){
            System.out.println("Ingrese una opcion para el menu");
            System.out.println("1. Agregar/Modificar/Eliminar Alumno");
            System.out.println("2. Agregar/Modificar/Eliminar Profesor");
            System.out.println("3. Agregar/Modificar/Eliminar Plato");
            System.out.println("4. Agregar/Modificar/Eliminar Pedido");
            System.out.println("5. Listado de pedidos del dia");
            System.out.println("6. Salir");
            Scanner entrada = new Scanner(System.in);
            switch (entrada.nextInt()) {
                case 1:
                    System.out.println("Elija una opcion");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    switch (entrada.nextInt()){
                        case 1:
                            agregarAlumno();
                            break;
                        case 2:
                            modificarAlumno();
                            break;
                        case 3:
                            eliminarAlumno();
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Elija una opcion");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    switch (entrada.nextInt()){
                        case 1:
                            agregarProfesor();
                            break;
                        case 2:
                            modificarProfesor();
                            break;
                        case 3:
                            eliminarProfesor();
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Elija una opcion");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    switch (entrada.nextInt()){
                        case 1:
                            agregarPlato();
                            break;
                        case 2:
                            modificarPlato();
                            break;
                        case 3:
                            eliminarPlato();
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Elija una opcion");
                    System.out.println("1. Agregar");
                    System.out.println("2. Modificar");
                    System.out.println("3. Eliminar");
                    switch (entrada.nextInt()){
                        case 1:
                            agregarPedido();
                            break;
                        case 2:
                            modificarPedido();
                            break;
                        case 3:
                            eliminarPedido();
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    break;
                case 5:
                    platosDelDia();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
    public void platosDelDia(){
        boolean vacio = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fecha de hoy");
        Fecha hoy = new Fecha(entrada.nextInt(),entrada.nextInt(),entrada.nextInt());
        for (Pedido pedido : pedidos){
            if(pedido.getFechaCreacion().igualQue(hoy)) {
                System.out.println("Plato: " + pedido.getPlato().getNombre());
                pedido.CalcularPrecio();
                vacio = false;
            }
        }
        if(vacio){
            System.out.println("No hay platos en ese dia");
        }
    }
//FALTA DEFAULT EN TODOS LOS METODOS
    private void eliminarPedido() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato a eliminar");
        String nombrePlato = entrada.next();
        System.out.println("Ingrese el nombre de la persona en el pedido a eliminar");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido de la persona en el pedido a eliminar");
        String apellido = entrada.next();
        for(int i = 0; i < pedidos.size(); i++){
            if(pedidos.get(i).getPersona().getNombre().equals(nombre) && pedidos.get(i).getPersona().getApellido().equals(apellido) && pedidos.get(i).getPlato().getNombre().equals(nombrePlato)){
                pedidos.remove(i);
                modificado = true;
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }

    private void modificarPedido() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato a eliminar");
        String nombrePlato = entrada.next();
        System.out.println("Ingrese el nombre de la persona en el pedido a eliminar");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido de la persona en el pedido a eliminar");
        String apellido = entrada.next();
        for(int i = 0; i < pedidos.size(); i++){
            if(pedidos.get(i).getPersona().getNombre().equals(nombre) && pedidos.get(i).getPersona().getApellido().equals(apellido) && pedidos.get(i).getPlato().getNombre().equals(nombrePlato)){
                System.out.println("Que quiere modificar");
                System.out.println("1. Fecha");
                System.out.println("2. Plato");
                System.out.println("3. Alumno");
                System.out.println("4. Profesor");
                System.out.println("5. horaEntrega");
                System.out.println("6. Estado entregado");
                switch (entrada.nextInt()){
                    case 1:
                        //Deberia hacer el Scanner pero ya estoy cansado jefe
                        pedidos.get(i).setFechaCreacion(new Fecha());
                        break;
                    case 2:
                        //Deberia hacer el Scanner pero ya estoy cansado jefe
                        pedidos.get(i).setPlato(new Plato());
                        break;
                    case 3:
                        //Deberia hacer el Scanner pero ya estoy cansado jefe
                        pedidos.get(i).setPersona(new Alumno());
                        break;
                    case 4:
                        //Deberia hacer el Scanner pero ya estoy cansado jefe
                        pedidos.get(i).setPersona(new Profesor());
                        break;
                    case 5:
                        pedidos.get(i).setHoraEntrega(entrada.next());
                        break;
                    case 6:
                        pedidos.get(i).setEntregado(entrada.nextBoolean());
                }
                modificado = true;
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }

    private void agregarPedido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dia de pedido");
        int dia = scanner.nextInt();
        System.out.println("Ingrese mes de pedido");
        int mes = scanner.nextInt();
        System.out.println("Ingrese anio de pedido");
        int anio = scanner.nextInt();
        Fecha fecha = new Fecha(dia,mes,anio);
        System.out.println("Elija un plato que quiere ingresar");
        for(int i = 0; i<platos.size(); i++){
            System.out.print((i+1 +": "));
            System.out.println(platos.get(i).toString());
        }
        int eleccion = scanner.nextInt();
        System.out.println("Elija una persona que quiere ingresar");
        for(int i = 0; i<personas.size(); i++){
            System.out.print((i+1 +": "));
            if(personas.get(i) instanceof Profesor) {
                Profesor profesor = (Profesor)personas.get(i);
                System.out.print((i+1) + ": ");
                System.out.println(profesor.toString());
            }else if(personas.get(i) instanceof Alumno){
                System.out.print((i+1) + ": ");
                Alumno alumno = (Alumno)personas.get(i);
                System.out.println(alumno.toString());
            }else{
                System.out.println(personas.get(i).toString());
            }
        }
        int eleccionPersonas = scanner.nextInt();
        System.out.println("Ingrese hora de entrega");
        String horaEntrega = scanner.next();
        System.out.println("Ingrese si se entrego o no");
        boolean entregado = scanner.nextBoolean();
        pedidos.add(new Pedido(fecha,platos.get(eleccion-1),personas.get(eleccionPersonas-1),horaEntrega,entregado));
    }

    private void eliminarPlato() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre a eliminar");
        String nombre = entrada.next();
        for(int i = 0; i < platos.size(); i++){
            if(platos.get(i).getNombre().equals(nombre)){
                platos.remove(i);
                modificado = true;
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }

    private void modificarPlato() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre a modificar");
        String nombre = entrada.next();
        for(int i = 0; i < platos.size(); i++){
            if(platos.get(i).getNombre().equals(nombre)){
                System.out.println("Que quiere modificar");
                System.out.println("1. Nombre");
                System.out.println("2. Precio");
                switch (entrada.nextInt()){
                    case 1:
                        platos.get(i).setNombre(entrada.next());
                        break;
                    case 2:
                        platos.get(i).setPrecio(entrada.nextInt());
                        break;

                }
                modificado = true;
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }


    private void agregarPlato() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese nombre de plato");
    String nombre = scanner.next();
    System.out.println("Ingrese precio");
    float precio = scanner.nextFloat();
    platos.add(new Plato(nombre, precio));
    }

    private void eliminarProfesor() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre a eliminar");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido a eliminar");
        String apellido = entrada.next();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i) instanceof Profesor) {
                Profesor profesor = (Profesor)personas.get(i);
                if (profesor.getNombre().equals(nombre) && profesor.getApellido().equals(apellido)) {
                    personas.remove(i);
                    modificado = true;
                }
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }

    private void modificarProfesor() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre a modificar");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido a modificar");
        String apellido = entrada.next();
        for(int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Profesor) {
                Profesor profesor = (Profesor) personas.get(i);
                if (profesor.getNombre().equals(nombre) && profesor.getApellido().equals(apellido)) {
                    System.out.println("Que quiere modificar");
                    System.out.println("1. Nombre");
                    System.out.println("2. Apellido");
                    System.out.println("3. Edad");
                    System.out.println("4. Direccion");
                    System.out.println("5. Descuento");
                    switch (entrada.nextInt()) {
                        case 1:
                            profesor.setNombre(entrada.next());
                            break;
                        case 2:
                            profesor.setApellido(entrada.next());
                            break;
                        case 3:
                            profesor.setEdad(entrada.nextInt());
                            break;
                        case 4:
                            profesor.setDireccion(entrada.next());
                            break;
                        case 5:
                            profesor.setDescuento(entrada.nextInt());
                    }
                    modificado = true;
                }
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }

    private void agregarProfesor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido");
        String apellido = scanner.next();
        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese Direccion");
        String direccion = scanner.next();
        System.out.println("Ingrese descuento");
        int descuento = scanner.nextInt();
        personas.add(new Profesor(nombre,apellido,edad,direccion,descuento));
    }

    private void eliminarAlumno() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre a eliminar");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido a eliminar");
        String apellido = entrada.next();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i) instanceof Alumno) {
                if (personas.get(i).getNombre().equals(nombre) && personas.get(i).getApellido().equals(apellido)) {
                    personas.remove(i);
                    modificado = true;
                }
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }

    private void modificarAlumno() {
        boolean modificado = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre a modificar");
        String nombre = entrada.next();
        System.out.println("Ingrese el apellido a modificar");
        String apellido = entrada.next();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i) instanceof Alumno) {
                Alumno alumno = (Alumno) personas.get(i);
                if (personas.get(i).getNombre().equals(nombre) && personas.get(i).getApellido().equals(apellido)) {
                    System.out.println("Que quiere modificar");
                    System.out.println("1. Nombre");
                    System.out.println("2. Apellido");
                    System.out.println("3. Edad");
                    System.out.println("4. Direccion");
                    System.out.println("5. Division");
                    System.out.println("6. Fecha nacimiento");
                    switch (entrada.nextInt()) {
                        case 1:
                            alumno.setNombre(entrada.next());
                            break;
                        case 2:
                            alumno.setApellido(entrada.next());
                            break;
                        case 3:
                            alumno.setEdad(entrada.nextInt());
                            break;
                        case 4:
                            alumno.setDireccion(entrada.next());
                            break;
                        case 5:
                            alumno.setDivision(entrada.next());
                        case 6:
                            alumno.setFechaDeNacimiento(new Fecha(entrada.nextInt(), entrada.nextInt(), entrada.nextInt()));
                            break;
                    }
                    modificado = true;
                }
            }
        }
        if(!modificado){
            System.out.println("No se encontro");
        }
    }

    private void agregarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido");
        String apellido = scanner.next();
        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese Direccion");
        String direccion = scanner.next();
        System.out.println("Ingrese dia de nacimiento");
        int dia = scanner.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = scanner.nextInt();
        System.out.println("Ingrese anio de nacimiento");
        int anio = scanner.nextInt();
        personas.add(new Alumno(nombre,apellido,edad,direccion,dia,mes,anio,new ArrayList<Materia>()));
    }
}
