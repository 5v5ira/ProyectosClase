//Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
// Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).

import java.util.Scanner;
public class Ejercicio15 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int num = scanner.nextInt();

        System.out.print("¿Tienes carnet de conducir?" + "(true/false)");
        boolean carnet = scanner.nextBoolean();

        boolean mayor = num>=21;
        boolean tienecarnet = mayor && carnet;

        System.out.println("Eres mayor de 21 años? " + mayor);
        System.out.println("¿Tienes carnet? " + tienecarnet);
        System.out.println("¿Puedes alquilar un coche? " + carnet);
    }
}
