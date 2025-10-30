//Desarrolla un programa que pida dos números al usuario y
// determine cuál es mayor, o si son iguales. Muestra el resultado por consola.

import java.util.Scanner;

public class Ejercicio32 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: " );
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: " );
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        }
        else{
            System.out.println("El numero " + num2 + " es mayor que " + num1);
        }
    }
}
