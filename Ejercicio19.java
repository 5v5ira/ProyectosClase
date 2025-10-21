//Escribe un programa que pida al usuario la puntuación de tres exámenes. Calcula la nota media y usa operadores relacionales para determinar si ha aprobado (>=5),
// si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introce del primer examen ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce del segundo examen ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce del tercer examen ");
        int num3 = scanner.nextInt();

        int media = (num1+num2+num3)/3;
        System.out.println("Nota media = " + media);

        boolean notable= media >=7;
        boolean sobrevaliente= media >=9;
        boolean aprobar= media >=5;

        System.out.println("¿Ha aprovado?= " + aprobar);
        System.out.println("¿tiene notable?= " + notable);
        System.out.println("¿tiene sobrevaliente? = " + sobrevaliente);



    }
}