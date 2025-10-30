import java.util.Scanner;

//Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario. Calcula el IMC (peso / altura²) y determina si está en peso normal (IMC entre 18.5 y 24.9),
// por debajo del peso normal (IMC menor a 18.5) o por encima del peso normal (IMC mayor a 24.9).

public class Ejercicio33 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu peso en kg: " );
        int peso = scanner.nextInt();

        System.out.print("Introduce tu altura en metros: " );
        double altura = scanner.nextDouble();

        double IMC= peso/(altura*altura);

        if (IMC>18.5 && IMC <24.9){

            System.out.println("Estas en peso normal");
        }
        if (IMC<=18.5){
            System.out.println("Estas por debajo del peso normal");
        }
        if (IMC>=24.9){
            System.out.println("Estas por encima del peso normal");
        }
    }
}
