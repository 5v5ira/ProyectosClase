//Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para determinar la estación del año:
// Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (del 1 al 12): ");
        int mes = scanner.nextInt();

        String estacion;

        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido. Debe estar entre 1 y 12.";
                break;
        }

        System.out.println("La estación es: " + estacion);
    }
}

