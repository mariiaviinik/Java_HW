package hw15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(rangeSum(10, 15));
        checkIfNumberPositive(-5);
        System.out.println(checkIfNumberNegative(-10));
        printLineCertainNumberOfTimes("Food", 3);
        System.out.println(ifYearLeap(1600));
    }

    static public void printThreeWords() {
        List<String> fruits = new ArrayList<>(Arrays.asList("Orange", "Banana", "Apple"));
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    static public void checkSumSign() {
        int a = 8;
        int b = -9;

        if (a + b >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    static public void printColor() {
        int value = 111;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static public void compareNumbers() {
        int a = 3;
        int b = -10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static public boolean rangeSum(int a, int b) {
        int sum = a + b;

        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static public void checkIfNumberPositive(int a) {
        if (a >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    static public boolean checkIfNumberNegative(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    static public void printLineCertainNumberOfTimes(String str, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(str);
        }
    }

    static public boolean ifYearLeap(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
