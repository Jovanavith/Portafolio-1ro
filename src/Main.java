import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("n= ");
        n = s.nextInt();
        for (int i=1; i<=1000; i++){
            System.out.println(i + " x " + n + " = " + (i*n));
        }
    }
}