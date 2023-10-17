package u0.ej1;

public class Main {
    public static void main(String[] args) {
        int N = 4;
        int G = 8;
        double A = 3.0;
        char C = 'a';
        System.out.println(N);
        System.out.println(A);
        System.out.println(C);
        System.out.println(N + A);
        System.out.println(A - N);
        System.out.println(C);
        if (G < N){
            System.out.println(G);
        }else if (G == N){
            System.out.println(G);
            System.out.println(N);
        }else{
            System.out.println(N);
        }

    }
}
