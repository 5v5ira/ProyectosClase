//Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado de las cinco operaciones aritméticas básicas:
// suma, resta, multiplicación, división y módulo (resto).
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2; // División entera
        int modulo = num1 % num2;

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo (resto): " + modulo);
    }
}