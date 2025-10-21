//Crea un programa que declare una variable con valor inicial 100 y aplique diferentes operadores de asignación compuesta
// (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación.

public class Ejercicio13 {
    public static void main (String args[]) {
    int valor=100;
    int sumar=50;
    int resta=30;
    int multiplicar= 2;
    int dividir= 4;
        System.out.println("valor inicial " + valor);
    int suma = valor + sumar;
        System.out.println("Despues de sumar " + sumar + " (+=): " + suma);
    int restar = suma - resta;
        System.out.println("Despues de restar " + resta + " (-=): " + restar);
    int multi= restar * multiplicar;
        System.out.println("Despues de multiplicar " + multiplicar + " (*=): " + multi);
    int total= multi / dividir;
        System.out.println("Despues de dividir " + dividir + " (/=): " + total);






    }
}
