public class Number10 {
    public static void main(String[] args) {

        // Write a program to print out duplicate elements from an Array of Strings?

        String[] cars= {"Subaru","BMW","Toyota","Rivian","Subaru"};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                if(cars[i].equals(cars[j])){
                    System.out.println("Duplicate car is " + cars[j]);
                }
            }
        }
    }
}
