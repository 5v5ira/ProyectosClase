//Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra
// (true/false). Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
// Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce salario por hora ");
        int salario = scanner.nextInt();

        System.out.print("Introduce las horas trabajadas ");
        int horas = scanner.nextInt();

        System.out.print("¿Haz hecho horas extra?" + " (true/false)");
        boolean hextra = scanner.nextBoolean();

        int horasNormales = Math.min(horas, 40); // máximo 40 horas normales
        int horasExtra = (hextra && horas > 40) ? horas - 40 : 0;

        System.out.println("Horas normales = " + horas);

        System.out.println("Horas extra = " + horasExtra);

        boolean trabajaste = horas > 40;
        boolean derecho = trabajaste;
        boolean aplicaX = derecho && hextra;

        int jornada  = salario*horas;
        int jornadaex = (salario * 2) * horasExtra ;
        int total = jornada + jornadaex;

        System.out.println("¿Trabajaste más de 40 horas? " + trabajaste);
        System.out.println("¿Tienes derecho a horas extra? " + derecho);
        System.out.println("¿Se aplican horas extra? " + aplicaX);

        System.out.println("Salario por horas normales= " + jornada);
        System.out.println("Salario por horas extra= " + jornadaex);
        System.out.println("Salario total= " + total);


    }
}