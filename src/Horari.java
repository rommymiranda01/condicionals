import java.util.Scanner;

public class Horari {
    public static void main(String[] args) {
        Scanner dades1 = new Scanner (System.in);
        System.out.print("Dies treballats: ");
        int Dies = dades1.nextInt();
        System.out.print("Hores treballades al dia: ");
        int Hores = dades1.nextInt();
        System.out.print("Preu hora: ");
        double Preu =dades1.nextDouble();
        System .out.println("Cobra tot el mes: ");
        System.out.println("Dies treballats: "+Dies);
        System.out.println("Hores treballades al dia: "+Hores);
        System.out.println("Preu hora: "+Preu);
        System.out.println("Cobra al mes: "+(Hores*Preu*Dies));
    }
}
