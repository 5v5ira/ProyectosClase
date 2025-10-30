//Desarrolla un programa que pida un número N y use un bucle for para contar cuántos números
// pares e impares hay desde 1 hasta N. Muestra ambos contadores.


import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        int par=0;
        int impar=0;
        System.out.println("Recorriendo números del 1 al " + numero + "...");

        for ( int cont = 1; cont <=numero; cont++){

            if (cont % 2 == 0) {
                par++;

            }
            else {
                impar++;
            }
        }
        System.out.print("Hay " + par + " numeros pares ");

        System.out.print("Hay " + impar + " numeros impares ");
    }
}
