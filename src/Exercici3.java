import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edat;
        String generemasculi, generefemeni;
        generemasculi = "A,C,E";
        generefemeni = "B,D,F";

        System.out.print("Quina edat tens?: ");
        edat = sc.nextInt();

        if (edat <= 16){
            System.out.println("Tens 16 anys o menys");
        }else if (edat <= 40){
            System.out.println("Tens entre 17 i 40 anys");
        }else{
            System.out.println("Tens entre 41 o més anys");
        }

        System.out.print("Quin gènere ets?: ");
        generefemeni = sc.nextLine();
        generemasculi = sc.nextLine();

        if (generefemeni.equals("B,D,F")){
            System.out.println("Ets genere femení");
        }else{
            System.out.println("Ets genere masculí");
        }
    }
}
