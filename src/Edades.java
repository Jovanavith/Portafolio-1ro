import java.util.Scanner;
public class Edades {
    public static void main(String[] args) {
        //Declaración de variables
        int edad;
        Scanner s = new Scanner(System.in);
        //Lectura de Datos
        System.out.print("Edad: ");
        edad = s.nextInt();
        //Proceso
        if (edad >= 18){
            System.out.println("Mayor de edad");
        }
        else {
            System.out.println("Menor de edad");
        }
}
}