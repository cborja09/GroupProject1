public class Number2 {
    public static void main(String[] args) {

        /*
        Create an array of integer values. After the array is created, calculate the sum of all
        stored elements in that array.
         */

        int[] numbers= {10,20,30,85};

        int sum=0;

        for (int i= 0; i < 4; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}
