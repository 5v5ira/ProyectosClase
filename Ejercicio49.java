//Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones, 2=Abdominales, 3=Sentadillas. Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer.
// Usa un switch para determinar el ejercicio y un for para contar las repeticiones una a una.

import java.util.Scanner;

public class Ejercicio49 {
    public static void main (String args[]) {

        System.out.println("-----EJERCICIOS----");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Elije un ejercicio (1-3): " );
        int ejer = scanner.nextInt();

        System.out.print("¿Cuántas repeticiones?: ");
        int repe = scanner.nextInt();

        for ( int cont = 1; cont <=repe; cont++) {
            System.out.println( "repeticion " + cont + " completada ");

        }


        int entrenamiento =0;
        String d= "deporte";

        switch (ejer) {
            case 1:
                d = "Flexiones";
                break;
            case 2:
                d = "Abdominales";
                break;
            case 3:
                d = "Sentadillas";
                break;
            default:
                System.out.println("Vuelve a intentarlo");
                break;
        }


        System.out.println ("¡Ejercicio completado! Has hecho " + repe + " " + d);

        }

    }


