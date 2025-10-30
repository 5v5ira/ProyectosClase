import java.util.Scanner;

//Desarrolla un programa que pida un número entero y determine si es par
// o impar usando el operador módulo. Muestra un mensaje personalizado para cada caso.
public class Ejercicio29 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) { //esto es lo que se pone en los numeros pares.
            System.out.print("El numero " + numero + " es par ");

        }
       else {
            System.out.print("El numero " + numero + " es impar ");
        }
    }
}
