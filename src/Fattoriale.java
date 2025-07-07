
import java.util.Scanner;

public class Fattoriale {

    public static void main(String[] args) {
        //fattoriale

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero da cui calcolare il fattoriale");

        int numeroInserito = scanner.nextInt();

        //num fattoriale = n * (n-1) * (n-2) * ... 1
        int fattoriale = numeroInserito;
        
        String result = numeroInserito + "";

        for (int i = 1; i < numeroInserito; i++) {
            fattoriale *= (numeroInserito - i);
            result += "x" +  (numeroInserito - i);
        }

        System.out.println(result + " = " + fattoriale);

    }
}
