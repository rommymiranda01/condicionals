import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String article;
        int unitats;
        float Iva= 1.21f,preu;

        System.out.println("Quin article has comprat?");
        article = sc.next();

        System.out.println("Quin preu té l'article?");
        preu = sc.nextFloat();

        System.out.println("Quantes unitats n'has comprat?");
        unitats = sc.nextInt();

        System.out.print("Has comprat " +unitats+ " unitats de " +article+ ".A " +preu+ "€ cadascuna el total és: " +(preu*unitats*Iva)+"€ amb Iva inclos.");
    }
}
