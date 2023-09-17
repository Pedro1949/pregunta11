import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora: ");
        int horas = scanner.nextInt();
        System.out.print("Minuto: ");
        int minutos = scanner.nextInt();

        int falta = (23 - horas) * 3600 + (59 - minutos) * 60;

        System.out.println("Fanta (segundos): " + falta );
    }
}
