import java.util.Scanner;

public class AsteriskTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int n = scanner.nextInt();

        String asterisks = "";

        for (int i = 0; i < n; i++) {
            asterisks = asterisks + '*';
            System.out.println(asterisks);
        }

        scanner.close();
    }
}
