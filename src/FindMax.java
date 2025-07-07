public class FindMax {
    public static void main(String[] args) {
        int[] array = {1,9,3,4,5,6,7,8,9,10,70};

        int max = 0;

        for(int i = 0; i<array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
