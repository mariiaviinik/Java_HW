package hw3;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Odd numbers
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i < 99);

        // Factorial
        int n = 9;
        int product = 1;
        int j = n;
        do {
            product *= j;
            j--;
        } while (j > 1);
        System.out.println("product = " + product);
    }
}
