public class Number4 {
    public static void main(String[] args) {

        /*
        Create a 2D array of integers. Develop a program which will calculate the sum of
        even and odd numbers for that array.
         */

        int[][] numbers= {
                {1,3,5,7,9,11},
                {12,14,16,18,20,22},

        };

        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven+= numbers[i][j];
                } else if (numbers[i][j]%2!=0) {
                    sumOdd+= numbers[i][j];
                }
            }
            
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
