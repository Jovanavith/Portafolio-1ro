import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double Peso, Estatura, IMC;

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el peso: ");
        Peso = s.nextDouble();
        System.out.println("Introduzca la estatura: ");
        Estatura = s.nextDouble();
        IMC = (Peso / Math.pow(Estatura,2));

        if (IMC <= 18.5) {
            System.out.println("Bajo peso ");
        }else if (IMC >= 18.6 && IMC <= 25) {
            System.out.println("Normal ");
        } else if (IMC >=25 && IMC <= 30) {
            System.out.println("Sobrepeso ");
        }else {
            System.out.println("Obesidad ");
        }

    }
    }