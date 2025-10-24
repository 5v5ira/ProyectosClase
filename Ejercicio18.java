//Desarrolla un programa que pida tres números al usuario y calcule: la suma de los tres, el promedio, el resultado de multiplicar el primero por el segundo y
//dividirlo entre el tercero. Usa paréntesis para controlar la precedencia de operadores.

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero " );
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero " );
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer numero " );
        int num3 = scanner.nextInt();

        int total = num1+num2+num3;
        System.out.println("Suma de los tres numeros= " + total);

        int total2 = (num1 + num2 + num3) / 3;
        System.out.println("Promedio = " + total2);

        int total3 = (num1*num2)/num3;
        System.out.println("Resultado de (número1 * número2) / número3: " + total3);




    }
}