import java.util.Scanner;
public class While {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("n= ");
        n = s.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " x " + n + " = " + (i * n));
            i++;
        }
    }
}