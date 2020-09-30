import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        int numEntrat;
        Scanner sc = new Scanner(System.in);
        int llistaNumeros[] = new int[4];

        System.out.print("Introdueix un numero de 4 xifres: ");
        numEntrat = sc.nextInt();

        llistaNumeros [3] = numEntrat % 10;
        llistaNumeros [2] = (numEntrat/10) % 10;
        llistaNumeros [1] = (numEntrat/10/10) % 10;
        llistaNumeros [0] = (numEntrat/10/10/10) %10;

        System.out.print(llistaNumeros[3]);
        System.out.print(llistaNumeros[2]);
        System.out.print(llistaNumeros[1]);
        System.out.print(llistaNumeros[0]);
    }
}
