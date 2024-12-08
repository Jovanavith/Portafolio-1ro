import java.util.Scanner;
public class Divisibles {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner s = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número principal
        System.out.print("Ingresa el número: ");
        int numero = s.nextInt();

        // Solicitar al usuario que ingrese el divisor
        System.out.print("Ingresa el divisor: ");
        int divisor = s.nextInt();

        // Verificar si el divisor es 0 para evitar división por 0
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            // Usar el operador % para verificar si el número es divisible por el divisor
            if (numero % divisor == 0) {
                System.out.println("El número " + numero + " es divisible por " + divisor);
            } else {
                System.out.println("El número " + numero + " no es divisible por " + divisor);
            }
        }

    }
}
