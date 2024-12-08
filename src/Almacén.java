import java.util.Scanner;
public class Almacén {
    public static void main(String[] args) {
        //Declaración de variables
        double pago;
        Scanner s= new Scanner(System.in);
        //Lectura de Datos
        System.out.print("Pago= ");
        pago = s.nextDouble();
        //Proceso
        if (pago >= 1000) {
            System.out.println("Descuento aplicado");
            System.out.println("El precio con descuento es= " + pago * .80);
        }
        else {
            System.out.println("Descuento no aplicado");
            System.out.println("El precio a pagar es= "+ pago);
        }


}
}