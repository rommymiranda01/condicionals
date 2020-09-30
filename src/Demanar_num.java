import java.util.Scanner;

public class Demanar_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4,num5;
        int sumaAcumulada=0;

        System.out.print("Introdueix el primer número: ");
        num1 = sc.nextInt();
        System.out.print("La suma acumulada és: "+(sumaAcumulada+=num1));
        System.out.println();

        System.out.print("Introdueix el segon número: ");
        num2 = sc.nextInt();
        System.out.print("La suma acumulada és: "+(sumaAcumulada+=num2));
        System.out.println();

        System.out.print("Introdueix el tercer número: ");
        num3 = sc.nextInt();
        System.out.print("La suma acumulada és: "+(sumaAcumulada+=num3));
        System.out.println();

        System.out.print("Introdueix el quart número: ");
        num4 = sc.nextInt();
        System.out.print("La suma acumulada és: "+(sumaAcumulada+=num4));
        System.out.println();

        System.out.print("Introdueix el cinquè número: ");
        num5 = sc.nextInt();
        System.out.print("La suma acumulada és: "+(sumaAcumulada+=num5));
    }
}
