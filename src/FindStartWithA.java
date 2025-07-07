

public class FindStartWithA {
    public static void main(String[] args) {
        String[] nomi = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};

        for (int i = 0; i < nomi.length; i++) {
            if(nomi[i].toUpperCase().charAt(0) == 'A'){
                System.out.println(nomi[i]);
            }
        }
    }
}
