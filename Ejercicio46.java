//Crea un programa que pida un número N y use un bucle for para
// calcular la suma de todos los números desde 1 hasta N. Muestra el resultado final.

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        int acum=0;
        int resultado=0;
        String suma= "";

        for ( int i = 0; i <=numero; i++) {
            resultado = acum += i;
            if (i == numero) {
                suma += i;
            } else {
                suma += i + " + ";
            }
        }
        System.out.println("Sumando: " + suma);
        System.out.println ("La suma de números del 1 al " + numero + " es " + resultado);
    }
}
