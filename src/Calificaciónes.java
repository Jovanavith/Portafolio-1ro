import java.util.Scanner;
public class Calificaciónes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas ingresar? ");
        int numCalificaciones = scanner.nextInt();

        // Contadores para cada rango de calificaciones
        int rango1 = 0; // 0 - 3.99
        int rango2 = 0; // 4 - 5.99
        int rango3 = 0; // 6 - 7.99
        int rango4 = 0; // 8 - 8.99
        int rango5 = 0; // 9 - 10

        for (int i = 1; i <= numCalificaciones; i++) {
            System.out.print("Ingresa la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();

            // Clasificación de la calificación en su rango correspondiente
            if (calificacion >= 0 && calificacion <= 3.99) {
                rango1++;
            } else if (calificacion >= 4 && calificacion <= 5.99) {
                rango2++;
            } else if (calificacion >= 6 && calificacion <= 7.99) {
                rango3++;
            } else if (calificacion >= 8 && calificacion <= 8.99) {
                rango4++;
            } else if (calificacion >= 9 && calificacion <= 10) {
                rango5++;
            } else {
                System.out.println("Calificación fuera de rango, por favor ingresa un valor entre 0 y 10.");
            }
        }

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("0 - 3.99: " + rango1 + " calificaciones");
        System.out.println("4 - 5.99: " + rango2 + " calificaciones");
        System.out.println("6 - 7.99: " + rango3 + " calificaciones");
        System.out.println("8 - 8.99: " + rango4 + " calificaciones");
        System.out.println("9 - 10: " + rango5 + " calificaciones");

    }
}
