//Escribe un programa que almacene la información de un producto
// (nombre, precio, código y disponibilidad) y muestre estos datos formateados por consola.

public class Ejercicio9 {
    public static void main (String args[]) {
        String nombre = "galletas";
        Double precio = 2.30;
        String codigo = "AU2025";
        Boolean disponibilidad = true;

        System.out.println("INFORMACION DEL PRODUCTO");
        System.out.println("-------------------------");
        System.out.println("nombre :"+nombre);
        System.out.println("precio :"+precio+ "€");
        System.out.println("codigo :"+ codigo);
        System.out.println("disponibilidad :"+ disponibilidad);

    }
}
