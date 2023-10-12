package hw2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AvgOfAnyAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word 'end' to stop input");

        double[] numbers = new double[10];
        int amountOfNumbers = 0;
        while (true) {
            if (amountOfNumbers == numbers.length) {
                double[] newArr = Arrays.copyOf(numbers, numbers.length * 2);
                numbers = newArr;
            }

            System.out.println("Enter " + (amountOfNumbers + 1) + " number");
            String inputVal = input.nextLine();

            if (inputVal.equals("end")) break;
            numbers[amountOfNumbers] = Integer.valueOf(inputVal);
            amountOfNumbers++;
        }

        double avg = 0.0;
        double sum = 0;
        for (int i = 0; i < amountOfNumbers; i++) {
            sum += numbers[i];
        }
        avg = sum / amountOfNumbers;

        System.out.println("Average value is " + avg);
    }
}
