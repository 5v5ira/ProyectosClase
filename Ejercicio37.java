//Escribe un programa para calcular el precio de entrada a un museo. Pide la edad del usuario y el día de la semana (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años: 5€ (pero gratis los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves).
// 65 años o más: 6€. Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.


import java.util.Scanner;

public class Ejercicio37 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: " );
        int edad = scanner.nextInt();

        System.out.print("Introduce el dia de la semana (numeros): " );
        int dias = scanner.nextInt();

        if(edad<12){
            System.out.println("Precio de entrada gratuita");
        }
        else if (edad>=12&&edad<=17&&dias==2){
            System.out.println("Precio de entrada gratuita€");
        }
        else if (edad>12&&edad<=17){
            System.out.println("Precio de entrada: 7€");
        }

        else if (edad>=18&&edad<=64){
            System.out.println("Precio de entrada: 10€");
        }
        else if (edad>=18&&edad<=64&&dias==4){
            System.out.println("Precio de entrada: 7€");
        }
        else if (edad<=65){
            System.out.println("Precio de entrada: 6€");
        }

        boolean menor = edad<12;
        boolean entre = edad>12&&edad<=17;
        boolean gratis = dias==2;

        System.out.println("Edad: " + edad);
        System.out.println("Dia de la semana: " + dias);
        System.out.println("¿Eres menor de 12? " + menor);
        System.out.println("¿Tienes entre 12 y 17? " + entre);
        System.out.println("¿Es martes?: " + gratis);

    }

}
