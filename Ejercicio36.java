//Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password". El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña es válida o no, indicando qué requisitos no cumple.
//
//Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).


import java.util.Scanner;

public class Ejercicio36 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una contraseña " );
        String contra = scanner.nextLine();

        int longitud = longitudCadena(contra);
        boolean tieneLongitud = longitud >= 8; //es un comando para boleano que detecta la longitud.
        boolean tieneNumero = contienNumero(contra); // es un comando para boleano que detecta numeros.
        boolean esProhibida = contra.equals("12345678") || contra.equalsIgnoreCase("password");

        // 3. Mostrar resultados
        System.out.println("Longitud de la contraseña: " + longitud);
        System.out.println("¿Tiene al menos 8 caracteres?: " + tieneLongitud);
        System.out.println("¿Contiene al menos un número?: " + tieneNumero);
        System.out.println("¿Es una contraseña prohibida?: " + esProhibida);

        // 4. Validación final
        boolean esValida = tieneLongitud && tieneNumero && !esProhibida;
        System.out.println("¿Es válida? (cumple todos los requisitos): " + esValida);

        if (!esValida) {
            System.out.print("Contraseña NO válida. ");
            if (!tieneLongitud) {
                System.out.print("Debe tener al menos 8 caracteres. ");
            }
            if (!tieneNumero) {
                System.out.print("Debe contener al menos un número. ");
            }
            if (esProhibida) {
                System.out.print("No puede ser una contraseña común como '12345678' o 'password'.");
            }
            System.out.println();
        }
    }

    // Función auxiliar: cuenta caracteres
    public static int longitudCadena(String texto) {
        return texto.length();
    }

    // Función auxiliar: verifica si hay al menos un número
    public static boolean contienNumero(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                return true;
            }
        }
        return false;



    }
}
