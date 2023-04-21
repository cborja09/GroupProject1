public class Number7 {
    public static void main(String[] args) {

        // Write a Java Program to print the first 10 numbers of Fibonacci series.

        int a= 0;
        int b= 1;
        int c;

        a = 0;
        b = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(a +" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
