
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa da invertire");
        String inserted = scanner.nextLine();

        for(int i = inserted.length() -1; i >= 0; i--){
            System.out.print(inserted.charAt(i));
        }

         scanner.close();
    }

}
