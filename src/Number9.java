public class Number9 {
    public static void main(String[] args) {

        // Write a java program to find the second-largest number in the array?

        int[] array= {1,2,3,4,5,6,7,8,9};

        int largest= array[0];
        int secondLargest= array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest){
                secondLargest= largest;
                largest= array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest= array[i];
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }
}
