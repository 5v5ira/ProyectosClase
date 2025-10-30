//Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false). Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%. Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€, descuento del 5%.
//
// En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado y el importe final.

import java.util.Scanner;

public class Ejercicio35 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el importe de la compra: " );
        double importe = scanner.nextDouble();

        System.out.print("¿Eres socio? (true/false): " );
        boolean socio = scanner.nextBoolean();

        double descuentoA = importe * 0.20;
        double importeaA = importe - descuentoA;


        double descuentoB = importe * 0.10;
        double importeB = importe -descuentoB;


        double descuentoC = importe *0.05;
        double importeC = importe - descuentoC;


        if(socio && importe>=200){
           System.out.println("Eres socio y tu compra es > 200€");
           System.out.println("Descuento aplicado (20%) " + descuentoA + "€");
            System.out.println("Descuento final : " + importeaA + "€");
        }
        else if(socio && importe<200){
            System.out.println("Eres socio y tu compra es < 200€");
            System.out.println("Descuento aplicado (10%) " + descuentoB + "€");
            System.out.println("Descuento final : " + importeB + "€");
        }

        else if(!socio && importe>=300){
            System.out.println("No eres socio y tu compra es > 300€");
            System.out.println("Descuento aplicado (5%) " + descuentoC + "€");
            System.out.println("Descuento final : " + importeC + "€");
        }
        else {
            System.out.println("No se aplica ningún descuento.");
            System.out.println("Importe final: " + importe + "€");
        }

    }
}
