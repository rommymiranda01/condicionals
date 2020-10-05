import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String frase;
    long tempsInici,tempsFinal,tempsTriga;
        System.out.println("Escriu covid-19: ");
        tempsInici = System.currentTimeMillis();
        frase = sc.nextLine();
        tempsFinal = System.currentTimeMillis();
        tempsTriga = (tempsFinal-tempsInici);

        if (tempsFinal <2){
            System.out.println("Ets un/a crack!");
        }else if (tempsFinal >=3){
            System.out.println("Ets molt lent");
        } else {
            System.out.println("Ets força ràpid");
        }
    }
}
