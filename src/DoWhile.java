import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);

        //N debe ser solo valors positivos
        do {
            System.out.println("n(Solo Valores positivos)= ");
            n = s.nextInt();
        }while (n<0);

        int i = 1;
        while (i <= 10) {
            System.out.println(i + " x " + n + " = " + (i * n));
            i++;
        }
    }
}