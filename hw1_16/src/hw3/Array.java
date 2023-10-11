package hw3;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random rand = new Random();

        // array with first 10 odd numbers
        int[] array = new int[10];
        int value = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 2;
        }

        for (int el : array) {
            System.out.print(el + ", ");
        }

        System.out.println();

        // create array2
        int n = 5;
        int[] array2 = new int[n];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(50);
        }

        System.out.println("Elements of array2: " + Arrays.toString(array2));

        // find minimal of array2
        int min = array2[0];

        for (int i = 1; i < array2.length; i++) {
            if (min > array2[i]) {
                min = array2[i];
            }
        }

        System.out.println("Minimal element in array2 is " + min);

        // find maximal of array2
        int max = array2[0];

        for (int i = 1; i < array2.length; i++) {
            if (max < array2[i]) {
                max = array2[i];
            }
        }

        System.out.println("Maximal element in array2 is " + max);

        // change places minimal and maximal elements of array2
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array2.length; i++) {
            if (min == array2[i]) {
                minIndex = i;
            }
            if (max == array2[i]) {
                maxIndex = i;
            }
        }

        array2[minIndex] = max;
        array2[maxIndex] = min;

        System.out.println("Changed minimal and maximal elements of array2:  " + Arrays.toString(array2));
    }
}
