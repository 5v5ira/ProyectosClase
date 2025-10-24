//Hágase un programa que convierta segundos en horas, minutos y segundos.
//(Segundos)

import java.util.Scanner;
public class Ejercicio24 {
    public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Número de segundos: ");
    int totalSegundos = scanner.nextInt();

    int horas = totalSegundos / 3600; //son los segundos que hay en una hora
    int resto = totalSegundos % 3600; // lo usamos para ver cuantos segundos nos sobran

    int minutos = resto / 60; // 60 son los segundos que hay en un minuto
    int segundos = resto % 60; // aqui podemos ver los segundos que sobran.

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
}
}