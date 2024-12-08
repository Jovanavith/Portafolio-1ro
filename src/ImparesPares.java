import java.util.Scanner;
public class ImparesPares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar? ");
        int N = s.nextInt();

        int sumaPares = 0;         // Variable para la suma de números pares
        int sumaImpares = 0;       // Variable para la suma de números impares
        int cuentaImpares = 0;     // Contador para saber cuántos impares se ingresan

        for (int i = 1; i <= N; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = s.nextInt();

            if (numero % 2 == 0) {  // Verifica si el número es par
                sumaPares += numero;
            } else {                // Si no es par, entonces es impar
                sumaImpares += numero;
                cuentaImpares++;
            }
        }

        // Cálculo del promedio de los impares
        double promedioImpares = (cuentaImpares > 0) ? (double) sumaImpares / cuentaImpares : 0;

        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("El promedio de los números impares es: " + promedioImpares);

    }
}
