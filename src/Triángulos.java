import java.util.Scanner;
public class Triángulos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Leer las longitudes de los lados
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = s.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = s.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = s.nextDouble();

        // Determinar si forman un triángulo, Para determinar si los tres lados ingresados pueden formar un triángulo,
        //se utiliza la desigualdad triangular, que establece que la suma de las longitudes de dos lados debe ser mayor
        // que el tercer lado en cualquier combinación
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Las longitudes forman un triángulo.");

            // Determinar el tipo de triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Las longitudes no forman un triángulo.");
        }
    }
}
