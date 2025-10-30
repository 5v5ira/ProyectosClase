import java.util.Scanner;

//Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción. La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango,
// muestra "Puedes subir", si no, indica el motivo (demasiado bajo o demasiado alto).

public class Ejercicio34 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu altura en cm: " );
        double altura = scanner.nextDouble();

        if(altura<1.15){
            System.out.println("No puedes subir, altura minima 1,15" );
        }
        if(altura>2.00){
            System.out.println("No puedes subir, altura maxima 2,00" );
        }
        else
            System.out.println("Puedes subir :)" );
    }
}
