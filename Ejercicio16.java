//Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
// Calcula el precio final después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.

import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Introduce el precio del producto" );
        double num1 = scanner.nextDouble();
        System.out.println("Precio original" + num1);

        System.out.print ("Introduce el porcentaje de descuento" );
        double num2 =scanner.nextDouble();
        System.out.println("Descuento" + num2);

        double total = num1 * num2/100;
        double END = num1 - total;

        System.out.println("Precio final " + END);



    }
}
