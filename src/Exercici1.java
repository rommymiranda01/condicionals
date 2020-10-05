import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float primerNum;
        String nom;

        System.out.print("Escriu el teu nom: ");
        nom=sc.nextLine();

        System.out.print("Escriu el primer número: ");
        primerNum=sc.nextFloat();

        if (primerNum > 1){
            System.out.println(nom+" estàs en positiu");
        }else{
            System.out.println(nom+" estàs en negatiu");
        }
    }
}
