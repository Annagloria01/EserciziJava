
import java.util.Scanner;

public class AsteriskRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di righe");
        int rows = scanner.nextInt();

        System.out.println("Inserisci il numero di colonne");
        int columns = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
