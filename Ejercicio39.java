
import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce el peso del paquete (kg): ");
        int peso = scanner.nextInt();

        System.out.print("Introduce la distancia de envío (km): ");
        int distancia = scanner.nextInt();

        System.out.print("¿Es envío urgente? (true/false): ");
        boolean urgente = scanner.nextBoolean();

        // Cálculos
        double precioBase = 5.0;
        double costePeso = 0.0;
        double costeDistancia = 0.0;

        if (peso > 5) {
            int exceso = peso - 5;
            costePeso = exceso * 2.0;
            System.out.println("Peso: " + peso + "kg (excede 5kg en " + exceso + "kg)");
        } else {
            System.out.println("Peso: " + peso + "kg (no excede 5kg)");
        }

    }

}