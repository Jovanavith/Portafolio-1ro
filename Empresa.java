import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double puntuacion;
        boolean puntuacionValida;

        do {
            System.out.print("Ingrese la puntuación del empleado (0.0, 0.4, 0.6 o más): ");
            puntuacion = s.nextDouble();
            puntuacionValida = true;

            double dinero = 2400 * puntuacion;

            if (puntuacion == 0.0) {
                System.out.println("Nivel de rendimiento: Inaceptable");
                System.out.println("Dinero obtenido: $" + dinero);
            } else if (puntuacion == 0.4) {
                System.out.println("Nivel de rendimiento: Aceptable");
                System.out.println("Dinero obtenido: $" + dinero);
            } else if (puntuacion >= 0.6) {
                System.out.println("Nivel de rendimiento: Meritorio");
                System.out.println("Dinero obtenido: $" + dinero);
            } else {
                System.out.println("Puntuación no válida. Por favor, ingrese 0.0, 0.4 o 0.6 o más.");
                puntuacionValida = false; // Seguimos en el ciclo si la puntuación no es válida
            }

        } while (!puntuacionValida); // Repetirá hasta que la puntuación sea válida

    }
}

