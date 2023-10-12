package org.example;

import java.util.Arrays;

public class ArraysChanger {
    public int[] getNumbersAfterFirst4(int[] arrOfNumbers) throws RuntimeException {
        if (arrOfNumbers.length == 0) {
            System.out.println("Array can't be empty");
            return null;
        }

        int[] resultArr = new int[arrOfNumbers.length];
        for (int i = 0; i < arrOfNumbers.length; i++) {
            if (arrOfNumbers[i] == 4) {
                resultArr = Arrays.copyOfRange(arrOfNumbers, i + 1, arrOfNumbers.length);
                break;
            }
            if (i == arrOfNumbers.length - 1) {
                throw new RuntimeException();
            }
        }
        return resultArr;
    }

    public boolean checkIncluding1And4(int[] arrOfNumbers) {
        if (arrOfNumbers.length == 0) {
            return false;
        }

        boolean isInclude1 = false;
        boolean isInclude4 = false;

        for (int number : arrOfNumbers) {
            if (number == 4) {
                isInclude4 = true;
            } else if (number == 1) {
                isInclude1 = true;
            }
        }
        return isInclude1 && isInclude4;
    }

    public static void main(String[] args) {
        ArraysChanger arraysChanger = new ArraysChanger();
        System.out.println(Arrays.toString(arraysChanger.getNumbersAfterFirst4(new int[]{1, 2, 3, 4, 5, 6, 6, 7})));
        System.out.println(arraysChanger.checkIncluding1And4(new int[]{1, 2, 3, 5, 6, 6, 7}));
    }
}
