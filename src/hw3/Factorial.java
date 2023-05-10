package hw3;

public class Factorial {
    public static void main(String[] args) {
        int n = 9;
        int product = 1;
        for (int i = n; i > 1; i--) {
            product *= i;
        }
        System.out.println("product = " + product);
    }
}
