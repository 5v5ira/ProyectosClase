//Crea un programa que use constantes para almacenar información que no debe cambiar (como el valor de PI o el nombre de una aplicación)
// y variables para información que puede cambiar. Muestra todos los valores.

public class Ejercicio5 {
    public static void main(String[] args) {
        // Constantes (valores que no cambian)
        final String NOMBRE_APP = "MiApp";
        final String VERSION = "1.0.0";
        final double PI = 3.14159;

        // Variables (valores que pueden cambiar)
        String usuario = "Laura";
        int nivel = 1;
        int puntuacion = 0;

        // Mostrar valores iniciales
        System.out.println("Aplicación: " + NOMBRE_APP);
        System.out.println("Versión: " + VERSION);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Usuario actual: " + usuario);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntuación: " + puntuacion);

        // Actualizar valores
        usuario = "Miguel";
        nivel = 2;
        puntuacion = 150;

        // Mostrar valores actualizados
        System.out.println("Usuario actualizado: " + usuario);
        System.out.println("Nivel actualizado: " + nivel);
        System.out.println("Puntuación actualizada: " + puntuacion);
    }
    }

