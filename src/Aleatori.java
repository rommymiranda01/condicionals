import java.util.Scanner;

public class Aleatori {
    public static void main(String[] args) {
        long milisegons;
        int numAleatori;
        Scanner daw = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        milisegons = System.currentTimeMillis();
        System.out.println("El número aleatori és: "+(milisegons%10));
    }
}
