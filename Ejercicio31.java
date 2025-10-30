//Crea un programa que pida una nota numérica (0-10)
// y determine la calificación: Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).

import java.util.Scanner;

public class Ejercicio31 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nota ");
        int nota = scanner.nextInt();

        if (nota >= 0 && nota <= 4) { //es la forma mas optima de agrupar a dos en uno.
            System.out.println("Estás suspendido");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Estás aprobado");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.");
        }
    }
}