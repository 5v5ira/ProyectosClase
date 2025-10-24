//Hágase una aplicación que permita introducir el número de bebidas y bocadillos
//comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
//bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
//€). También se podrá introducir el número de alumnos que realizaron la compra
//(valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
//bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
//redondeada a 2 decimales. (CosteBar)


import java.util.Scanner;

public class Ejercicio21 {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de bebidas (entre 0 y 20)");
        int bebidas = scanner.nextInt();

        System.out.print("Número de bocadillos (entre 0 y 20))");
        int bocadillos =scanner.nextInt();

        System.out.print("Precio de cada bebida (entre 0,00 y 3,00)");
        double bebidaP =scanner.nextDouble();

        System.out.print("Precio de cada bocadillo (entre 0,00 y 5,00)");
        double bocadillosP =scanner.nextDouble();

        System.out.print("Número de alumnos (entre 1 y 15)");
        int personas = scanner.nextInt();


         double bebidastotal= bebidas * bebidaP;
         double bocadillostotal= bocadillos * bocadillosP;
         double totalcompra= bebidastotal+ bocadillostotal;
         double definitivo= totalcompra/personas;

         System.out.println("Subtotal bebidas: " + bebidastotal);
        System.out.println("Subtotal bocadillos: " + bocadillostotal);
        System.out.println("Total de la compra: " + totalcompra);
        System.out.println("Cantidad por alumno: " + definitivo);


    }

}
