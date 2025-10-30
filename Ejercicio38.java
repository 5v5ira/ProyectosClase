//Desarrolla un programa que determine si una persona es elegible para un préstamo bancario. Pide: edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son: Edad entre 21 y 65 años, ingresos mensuales de al menos 1000€, y NO tener deudas pendientes.
// El programa debe evaluar cada condición y mostrar si es elegible o no, explicando qué requisitos no cumple.

import java.util.Scanner;

public class Ejercicio38 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: " );
        int edad = scanner.nextInt();

        System.out.print("Introduce tus ingresos mensuales: " );
        int ingresos = scanner.nextInt();

        System.out.print("¿Tienes deudas pendientes? (true/false): " );
        boolean deuda = scanner.nextBoolean();

        boolean entre = edad>=21&&edad<=65;
        boolean ingreso = ingresos>=1000;
        boolean deudas = !deuda;
        boolean prestamo= entre&&ingreso&&!deuda;

        System.out.println("¿Edad entre 21 y 65? " + entre);
        System.out.println("¿Ingresos >= 1000€? " + ingreso);
        System.out.println("¿Sin deudas pendientes?: " + deudas);
        System.out.println("¿Es elegible para el préstamo?: " + prestamo);

        if (entre&&ingreso&&!deuda){
        System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo ");
        }
        else { System.out.println ("No eres elegible para solicitar el préstamo ");

        }
    }
}
