package hw3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int inputNum = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(inputNum + "*" + i + " = " + inputNum * i);
        }
    }
}
