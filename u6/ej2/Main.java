package u6.ej2;


public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Perro p1 = new Perro("Max","Lautaro");
        Perro p2 = new Perro("Toby","Alex");
        sistema.getMascota().add(p1);
        sistema.getMascota().add(p2);


        Gato g1 = new Gato("Garfield","Aron");
        Gato g2 = new Gato("Doraemon","Juan");
        sistema.getMascota().add(g1);
        sistema.getMascota().add(g2);


        Pajaro pa1 = new Pajaro("Alita","Florinda",true);
        Pajaro pa2 = new Pajaro("Piquito","Cleo",false);
        sistema.getMascota().add(pa1);
        sistema.getMascota().add(pa2);


        Peces pe1 = new Peces("dory","Nahuel");
        Peces pe2 = new Peces("nemo","Roman");
        sistema.getMascota().add(pe1);
        sistema.getMascota().add(pe2);


        sistema.saludar(p1, "Alex");
        System.out.println(p1.getAlegria());
        p1.alimentar();
        p1.alimentar();
        p1.alimentar();
        System.out.println(p1.getAlegria());
        p1.alegria();
        pa1.saludo(true);
        pa1.saludo(false);
        System.out.println(sistema.getMascota().size());
        sistema.saludar(pe1, "Nahuel");
        System.out.println(sistema.getMascota().size());

    }
}