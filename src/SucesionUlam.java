import java.util.Scanner;
public class SucesionUlam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = s.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo.");
        } else {
            System.out.print("La sucesión de Ulam es: " + numero);

            while (numero != 1) {
                if (numero % 2 == 0) { // Si el número es par
                    numero /= 2;
                } else { // Si el número es impar
                    numero = numero * 3 + 1;
                }

                System.out.print(", " + numero);
            }
        }

    }
}
