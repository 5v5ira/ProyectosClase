//Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones relacionales entre ellos
        //(mayor que, menor que, igual, diferente, mayor o igual, menor o igual).

import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("INTRODUCE EL PRIMER NUMERO" );
        int num1 = scanner.nextInt();
        System.out.print ("INTRODUCE EL SEGUNDO NUMERO" );
        int num2 =scanner.nextInt();

        System.out.println ("¿" + num1 + " es mayor que " + num2 + "? " + (num1 > num2));
        System.out.println ("¿" + num1 + " es menor que " + num2 + "? " + (num1 < num2));
        System.out.println ("¿" + num1 + " es igual que " + num2 + "? " + (num1 == num2));
        System.out.println ("¿" + num1 + " es diferente " + num2 + "? " + (num1 != num2));
        System.out.println ("¿" + num1 + " mayor o igual " + num2 + "? " + (num1 >= num2));
        System.out.println ("¿" + num1 + " es menor o igual " + num2 + "? " + (num1 <= num2));

        scanner.close();

    }
}
