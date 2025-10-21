//Crea un programa que pida al usuario su edad y si es estudiante (true/false). Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos:
// descuento joven (menor de 26 años), descuento estudiante, o descuento especial (menor de 26 Y estudiante).

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿introduce tu edad?");
        int edad= scanner.nextInt();

        System.out.print("¿Eres estudiante? " + "(true/false)");
        boolean estu = scanner.nextBoolean();

        boolean menor = edad<26;
        boolean eres = estu;
        boolean descuento = menor;
        boolean estudios = estu;
        boolean especial = menor && eres;
        boolean no = !estu;

        System.out.println("¿Eres menor de 26 años?" + menor);
        System.out.println("¿Eres estudiante?" + estu);
        System.out.println("¿No eres estudiante?" + no);
        System.out.println("¿Tienes descuento joven?" + menor);
        System.out.println("¿Tienes descuento estudiante?" + menor);
        System.out.println("¿¿Tienes descuento especial?" + especial);




    }
}