import java.util.Scanner;

//Escribe un programa que pida la nota de un examen (entre 0 y 10)
// y determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.
public class Ejercicio27 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nota (entre 0 y 10) " );
        int nota= scanner.nextInt();
        if (nota<5){
            System.out.println("Has suspendido");
        }
        else{
            System.out.println("Enhorabuena, has aprobado");
        }
    }
}
