//Escribe un programa que pida un número entero positivo y calcule su factorial usando un bucle for.
// El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1

import java.util.Scanner;

public class ejercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        int acum=1;

        for ( int cont = 1; cont <= numero; cont++){
            acum *=cont;
        }
        System.out.println("El factorial de " + numero + " es: " + acum);
    }
}
