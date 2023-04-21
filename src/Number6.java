public class Number6 {
    public static void main(String[] args) {

        // Write a java program to check whether a given number is prime or not?

        int number=19;
        boolean prime=true;
        for (int i = 2; i < number; i++) {
            if(number%i==0){
                prime=false;
                break;
            }
        }
        if (prime){
            System.out.println("The number "+number+" is prime");
        }else {
            System.out.println("The number "+number+" is prime");
        }
    }
}
