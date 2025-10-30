//Crea un programa que pida el importe de una compra. Si el importe es mayor o igual
//a 100€, aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.

import java.util.Scanner;

public class Ejercicio28 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el importe de la compra: " );
        double importe = scanner.nextDouble();

        if (importe>=100){
            double descuento = importe * 0.10;
            double total = importe - descuento;

            System.out.println("Importe original: " + importe);
            System.out.println("Descuento aplicado: " + descuento);
            System.out.println("Importe final " + total);



        }
        else{
            System.out.println("Importe original " + importe);
        }
    }

}
