public class Number5 {
    public static void main(String[] args) {

        //  Write a program to swap 2 numbers without a temporary variable?

        int a= 10;
        int b= 30;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" After the swap : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);


    }
}
