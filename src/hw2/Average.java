package hw2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1");
        double number1 = input.nextInt();

        System.out.println("Enter number 2");
        double number2 = input.nextInt();

        double sum = 0.0;
        double avg = 0.0;

        sum = number1 + number2;
        avg = sum / 2;

        System.out.println("Average value is " + avg);
    }
}
