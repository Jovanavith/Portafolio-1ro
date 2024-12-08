import java.util.Scanner;
public class CambioMoneda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Dolares;
        double Cambio;
        System.out.print("Dolares: ");
        Dolares = s.nextInt();
        Cambio = Dolares * 12.48;
        System.out.print("Su cambio es de: " + Cambio + " Pesos");


}
}