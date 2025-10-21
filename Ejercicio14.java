//Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo.
// Muestra el resultado por consola.
//
import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num = scanner.nextInt();
        int resto = num % 2;
        if (resto ==0){
            System.out.println("El numero " + num + " es par ");
        } else{
            System.out.println("El numero " + num + " es impar ");
            scanner.close();
        }
    }
}
