//Crea un programa que pida un número del 1 al 7 y use un switch
// para mostrar el día de la semana correspondiente (1=Lunes, 2=Martes, etc.).
import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número (1-7): ");
        int numero = scanner.nextInt();

        String dia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido. Debe estar entre 1 y 7.";
        }

        System.out.println("El día " + numero + " es: " + dia);
    }
}
