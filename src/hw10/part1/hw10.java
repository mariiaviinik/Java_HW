package hw10.part1;

import hw3.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class hw10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "juice", "banana", "orange",
                "tree", "dog", "sand", "orange", "pig", "computer", "happiness", "forest", "apple juice", "orange", "apple", "juice"
        ));

        System.out.println("NUMBER1 #####################################");
        System.out.println(countOccurrence(list, "apple"));
        System.out.println(countOccurrence(list, "orange"));

        System.out.println("NUMBER2 #####################################");
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(toList(nums));

        System.out.println("NUMBER3 #####################################");
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 8, 9, 9, 0, 0));
        System.out.println(findUnique(integerList));

        System.out.println("NUMBER4.1 #####################################");
        System.out.println(calcOccurance(list));
        System.out.println("NUMBER4.2 #####################################");
        System.out.println(findOccurance(list));
    }

    public static int countOccurrence(List<String> list, String str) {
        int counter = 0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == str) {
                counter++;
            }
        }
        return counter;
    }

    public static <T> List toList(T array[]) {
        List<T> newList = new ArrayList<>(Arrays.asList(array));
        return newList;
    }

    public static List findUnique(List<Integer> integerList) {
        List<Integer> newList = new ArrayList<>(Arrays.asList(integerList.get(0)));
        boolean condition = true;

        Iterator<Integer> iterator = integerList.iterator();
        Iterator<Integer> newListIterator = newList.iterator();

        while (iterator.hasNext()) {
            int next = iterator.next();
            newListIterator = newList.iterator();

            while (newListIterator.hasNext()) {
                if (newListIterator.next() == next) {
                    condition = false;
                    break;
                }
            }
            if (condition) {
                newList.add(next);
            }
            condition = true;
        }

        return newList;
    }

    public static String calcOccurance(List<String> list) {
        List<Integer> counterList = new ArrayList<>();
        List<String> uniqeList = new ArrayList<>();

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!uniqeList.contains(next)) {
                uniqeList.add(next);
                counterList.add(1);
            } else {
                counterList.set(uniqeList.indexOf(next), counterList.get(uniqeList.indexOf(next)) + 1);
            }
        }

        String result = "";
        for (int i = 0; i < uniqeList.size(); i++) {
            result += uniqeList.get(i) + ": " + counterList.get(i) + "\n";
        }

        return result;
    }

    public static String findOccurance(List<String> list) {
        List<Integer> counterList = new ArrayList<>();
        List<String> uniqeList = new ArrayList<>();

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!uniqeList.contains(next)) {
                uniqeList.add(next);
                counterList.add(1);
            } else {
                counterList.set(uniqeList.indexOf(next), counterList.get(uniqeList.indexOf(next)) + 1);
            }
        }

        String result = "[\n";
        for (int i = 0; i < uniqeList.size(); i++) {
            result += "{name: " + "\"" + uniqeList.get(i) + "\", occurrence:" + counterList.get(i) + "},\n";
        }
        result += "]";
        return result;
    }
}