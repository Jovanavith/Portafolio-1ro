import java.util.Scanner;
public class Mayores {
    public static void main(String[] args) {
        int n, auxMayor = 0;
        Scanner s= new Scanner(System.in);
        for (int i = 0; i < 5 ; i++){
            n = s.nextInt();
            if (auxMayor < n) {
                auxMayor = n;

            }
        }
        System.out.println("El mayor es = " + auxMayor);
    }
}
