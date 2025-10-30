//Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.


import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        for ( int i = 0; i <=10; i++) {

            int resultado = numero * i;

            System.out.println (resultado);
        }
    }
}