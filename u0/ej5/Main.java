package u0.ej5;

public class Main {
    public static void main(String[] args) {
        String sPalabra ="Ayer me compre muñecos de la marca ‘Colchitas’ por internet";
        int contador = 0;
        char letra = 'a';
        for(int x=0;x<sPalabra.length();x++) {
            if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){
                contador++;
            }
        }
        System.out.println("La palabra " + sPalabra + "contiene " + contador + " vocales");
        System.out.println(sPalabra.replace('e',letra));
    }
}
