//Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
//centenas, decenas y unidades), y se obtiene el número correspondiente.
//(Numero)

import java.util.Scanner;

public class Ejercicio23 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Decenas de mil ");
        int mil = scanner.nextInt();

        System.out.print("Unidades de mil : ");
        int unidamil = scanner.nextInt();

        System.out.print("Centenas: ");
        int centenas = scanner.nextInt();

        System.out.print("Unidades: ");
        int unidades = scanner.nextInt();

        int total = mil*10000 + unidamil * 1000+ centenas * 100 + centenas * 10 + unidades;

        System.out.println(total);








    }
}
