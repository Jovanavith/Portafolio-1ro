import java.util.Scanner;
public class SerieHarmonica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo n: ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo.");
        } else {
            double suma = 0.0;

            // Cálculo de la serie 1 + 1/2 + 1/3 + ... + 1/n
            for (int i = 1; i <= n; i++) {
                suma += 1.0 / i;  // Suma cada término de la serie
            }

            System.out.println("El resultado de la serie es: " + suma);
        }
    }
}
