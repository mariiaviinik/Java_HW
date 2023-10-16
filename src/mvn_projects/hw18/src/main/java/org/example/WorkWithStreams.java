package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toMap;

public class WorkWithStreams {
    static public int calculateAverage(List<Integer> numbers) {
        int average = numbers
                .stream()
                .reduce(0, (a, b) -> a + b)
                / numbers.size();

        return average;
    }

    static public Map<String, String> elementsToUpperCaseToMap(List<String> strings) {
        Map<String, String> result = strings
                .stream()
                .map((string) -> string.toUpperCase())
                .collect(toMap(String::toLowerCase, String::valueOf));

        return result;
    }

    static public List<String> findWordsByPredicates(List<String> strings) {
        Predicate<String> isLength4 = (str) -> str.length() == 4;
        Predicate<String> isLowerCase = (str) -> str.equals(str.toUpperCase());

        List<String> filteredStrings = strings
                .stream()
                .filter((str) -> isLength4.and(isLowerCase).test(str))
                .toList();

        return filteredStrings;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 3, 5);
        System.out.println(calculateAverage(numbers));

        List<String> strings = Arrays.asList("one", "two", "three", "FOUR", "FIVE", "SIX", "seven", "eight", "nine");
        System.out.println(elementsToUpperCaseToMap(strings).toString());

        System.out.println(findWordsByPredicates(strings).toString());
    }
}
