import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notaUF1,notaUF2,notaUF3,notaUF4,notaUF5,notaUF6=0;
        float finalAcumulada=0;

        System.out.print("Introdueix la nota de la UF1: ");
        notaUF1 = sc.nextFloat();
        finalAcumulada+=notaUF1;
        System.out.print("Introdueix la nota de la UF2: ");
        notaUF2 = sc.nextFloat();
        finalAcumulada+=notaUF2;
        System.out.print("Introdueix la nota de la nota UF3: ");
        notaUF3 = sc.nextFloat();
        finalAcumulada+=notaUF3;
        System.out.print("Introdueix la nota de la nota UF4: ");
        notaUF4 = sc.nextFloat();
        finalAcumulada+=notaUF4;
        System.out.print("Introdueix la nota de la nota UF5: ");
        notaUF5 = sc.nextFloat();
        finalAcumulada+=notaUF5;
        System.out.print("Introdueix la nota de la nota UF6: ");
        notaUF6 = sc.nextFloat();
        finalAcumulada+=notaUF6;

        System.out.println("Notes: UF1: "+notaUF1+", UF2: "+notaUF2+", UF3: "+notaUF3+", UF4: "+notaUF4+", UF5: "+notaUF5+" i UF6:"+notaUF6);
        System.out.println("Nota final MP: "+finalAcumulada/6);
    }
}
