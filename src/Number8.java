public class Number8 {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int[] array= {2,4,6,8,10};

        int max= array[0];
        int min= array[0];

        for (int i = 2; i < array.length; i++) {
            if (array[i]>max){
                max= array[i];
            } else if (array[i]<min) {
                min= array[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
