import java.util.Scanner;
public class Cambio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Puedes poner double para poner decimales y despues declarar las variables de forma continua, por ejeplo
        //double PRE, PAG, cambio; y así ahorrar espacio.
        int Precio;
        int Pago;
        int Cambio;
        System.out.print("Precio del Producto: ");
        Precio= s.nextInt();
        System.out.print("Pago del cliente: ");
        Pago= s.nextInt();
        Cambio= Precio - Pago;
        System.out.println("El cambio es: " + Cambio);
    }
}
