//Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un switch para mostrar el mensaje correspondiente:
// A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        String letra = scanner.nextLine();

        String nota= "letra no valida";


        switch (letra){
            case "A":
                nota = "Excelente ";
                break;


            case "B":
                nota = "Muy bien ";
                break;


            case "C":
                nota = "Bien ";
                break;


            case "D":
                nota = " Suficiente ";
                break;


            case "F":
                nota = " Insuficiente ";
                break;


        }
        System.out.println("Calificación " + letra + " " + nota) ;
    }
}