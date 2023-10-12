package hw3;

public class WithWhileLoop {
    public static void main(String[] args) {
        // Odd numbers
        int i = 1;
        while (i < 99) {
            System.out.println(i);
            i += 2;
        }

        // Factorial
        int n = 9;
        int product = 1;
        int j = n;
        while (j > 1) {
            product *= j;
            j--;
        }
        System.out.println("product = " + product);
    }
}
