import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner figures = new Scanner (System.in);
        /*double b,h;
        System.out.print("Valor Base: ");
        b=figures.nextDouble();
        System.out.print("Valor Altura: ");
        h=figures.nextDouble();
        double area;
        area=b*h/2;
        System.out.print(area);*/

        double rati, area;
        System.out.print("Valor Rati Circumferencia: ");
        rati = figures.nextInt();
        area = 3.14159*(rati*rati);
        System.out.printf("L'àrea de la circumferencia es: %f",area);
        figures.close();
    }
}
