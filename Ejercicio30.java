//Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
// Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".

import java.util.Scanner;

public class Ejercicio30 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad " );
        int nota = scanner.nextInt();

        if (nota>=16){
            System.out.println("Acceso permitido");
        }
        else{
            System.out.println("Acceso denegado, debes de tener al menos 16 años");
        }
    }
}
