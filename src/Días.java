import java.util.Scanner;
public class Días {
    public static void main(String[] args) {

        int numeroSemana;
        String semana = "";
        Scanner s= new Scanner(System.in);

        System.out.print("Ingrese número de la semana: ");
        numeroSemana = s.nextInt();

        switch (numeroSemana) {
            case 1:
                semana = "Lunes";
                break;
            case 2:
                semana = "Martes";
                break;
            case 3:
                semana = "Miércoles";
                break;
            case 4:
                semana = "Jueves";
                break;
            case 5:
                semana = "Viernes";
                break;
            case 6:
                semana = "Sábado";
                break;
            case 7:
                semana = "Domingo";
                break;
            default: semana= "no es compatible";
                break;
        }
        System.out.println("El día de la semana es " + semana);
    }
}
