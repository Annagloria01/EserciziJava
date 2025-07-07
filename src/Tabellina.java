import java.util.Scanner;

public class Tabellina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero di una tabellina");
        int numero = scanner.nextInt();
        
        System.out.println("Inserisci numero al quale la tabellina deve arrivare");
        int numeroFinetabellina = scanner.nextInt();

        for (int i = 0; i <= numeroFinetabellina; i++) {
            System.out.println("Ecco il tuo prodotto:" + (numero * i));
            
        }

        scanner.close();
    }

    
}
