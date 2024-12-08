import java.util.Scanner;
public class Ascendentes {
    public static void main(String[] args) {

        //Declaración de variables
        double num1, num2;
        Scanner s= new Scanner(System.in);

        //Lectura de datos
        System.out.print("Ingrese número 1: ");
        num1 = s.nextDouble();

        System.out.print("Ingrese número 2: ");
        num2 = s.nextDouble();

        //Proceso
        if (num1 > num2){
            System.out.println("El más bajo en orden es: " + num2);
            System.out.println("El más alto en orden es: " + num1);
        }
        else {
            System.out.println("El más alto en orden es: " + num1);
            System.out.println("El más bajo en orden es: " + num2);
        }
}
 }
