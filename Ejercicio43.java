//Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir.
// Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main (String args[]) {

        System.out.println("-----MENÚ----");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int numero = scanner.nextInt();

        int menu =0;

        switch (numero) {
            case 1:
                System.out.println(" Haz seleccionado : Ver perfil");
                break;
            case 2:
                System.out.println("Haz seleccionado : Configuración");
                break;
            case 3:
                System.out.println("Haz seleccionado : Ayuda");
                break;
            case 4:
                System.out.println("Haz seleccionado : Salir");
                break;
            default:
                System.out.println("Haz seleccionado : Vuelve a intentarlo");
                break;
        }
        return;
    }
}
