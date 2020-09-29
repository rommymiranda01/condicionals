import java.util.Scanner;

public class Aleatori {
    public static void main(String[] args) {
        Scanner daw = new Scanner(System.in);
        int numIntroduit;
        long numAleatori;
        System.out.print("Introdueix un número del 10 al 100: ");
        numIntroduit=daw.nextInt();
        long timestap = System.currentTimeMillis();
        numAleatori = (timestap % numIntroduit)+1;
        System.out.println("El número aleatori és: "+numAleatori);
    }
}
