public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {2312, 9, 3, 4, 5, 6, 7, 8, 9, 10, 70, 42434};
        
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
