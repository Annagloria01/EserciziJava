public class FindMin {
    public static void main(String[] args) {
        int[] array = {2312,9,3,4,5,6,7,8,9,10,70,42434};

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
