import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Para leer entrada del usuario
        int numero;

        do {
            System.out.print("Introduce un número (mayor que 5 para salir): ");
            numero = s.nextInt();  // Leer el número del usuario

        } while (numero <= 5);  // Sigue pidiendo mientras el número sea menor o igual a 5

        System.out.println("¡Has introducido un número mayor que 5! Fin del programa.");
    }
}
