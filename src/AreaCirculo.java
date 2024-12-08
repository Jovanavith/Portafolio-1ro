import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Area;
        int Radio;
        int Circunferencia;
        int Pi = (int) 3.1416;
        System.out.print("Radio del círculo: ");
        Radio = s.nextInt();
        Area = Pi * (Radio * Radio);
        Circunferencia = 2 * Pi * Radio;
        System.out.print("El Área es igual a: " + Area + " metros ");
        System.out.print("La Círcunferencia es igual a: " + Circunferencia + " metros");
    }
}
