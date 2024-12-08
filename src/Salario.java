import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        //Declaración de variables
        int pago1, pago2, horae, horas;
        pago1 = 16;
        pago2 = 20;
        Scanner s= new Scanner(System.in);
        //Lectura de Datos
        System.out.print("Total de Horas trabajadas= ");
        horas = s.nextInt();
        horae = horas - 40;
        //Proceso
        if (horas > 40){
            System.out.println("Total a pagar= $" + ((pago1 *40) + (horae * pago2)));
        }
        else {
            System.out.println("Total a pagar= $" + pago1 * horas);
        }
    }
}
