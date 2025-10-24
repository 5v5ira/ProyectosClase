//Permítase introducir el valor con IVA de una compra con dos decimales (la
//compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha
//compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue
//el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)
//Valor de la compra (entre 0.00 y 500.00): 298,45
//IVA (entre 0 y 25%): 12

import java.util.Scanner;
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de la compra con IVA (entre 0.00 y 500.00): ");
        double conIVA = scanner.nextDouble();

        if (conIVA < 0 || conIVA > 500) {
            System.out.println("El valor de la compra está fuera de rango.");
            return; //esto se usa para bloquear el programa si se imcumple la petición.
        }

        System.out.print("IVA aplicado (entre 0 y 25%): ");
        int ivaPorcentaje = scanner.nextInt();

        if (ivaPorcentaje < 0 || ivaPorcentaje > 25) {
            System.out.println("El porcentaje de IVA está fuera de rango.");
            return;
        }

        double sinIVA = conIVA / (1 + ivaPorcentaje / 100.0);
        double ivaImporte = conIVA - sinIVA;


        System.out.printf("Precio sin IVA: %.2f €\n", sinIVA);
        System.out.printf("Importe del IVA: %.2f €\n", ivaImporte);
    }
}
