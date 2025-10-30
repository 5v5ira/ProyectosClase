//Desarrolla un programa que pida un número al usuario y determine si es positivo, negativo o cero.
// Muestra el resultado por consola.
import java.util.Scanner;
public class Ejercicio26 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        int num = scanner.nextInt();

        if (num<0){
         System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es positivo " );
        }
    }
}
