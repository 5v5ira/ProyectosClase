//Escribe un programa que pida dos números y una operación (+, -, *, /).
// Usa un switch para realizar la operación correspondiente y mostrar el resultado.


import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero : ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce la operación (+, -, *, /): ");
        String operacion = scanner.next();

        int resultado = 0;


        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;


            case "-":
                resultado = num1 - num2;
                break;


            case "*":
                resultado = num1 * num2;
                break;


            case "/":
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Vuelve a intentarlo");
        }
        System.out.println("Resultado " + resultado);
    }
}

