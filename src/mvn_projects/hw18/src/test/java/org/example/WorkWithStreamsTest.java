package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WorkWithStreamsTest {
    WorkWithStreams wws = new WorkWithStreams();
    List<String> strings = Arrays.asList("one", "two", "three", "FOUR", "FIVE", "SIX", "seven", "eight", "nine");

    @Test
    void calculateAverage() {
        int result = wws.calculateAverage(Arrays.asList(7, 3, 5));
        assertEquals(5, result);
    }

    @Test
    void elementsToUpperCaseToMap() {
        Map<String, String> result = wws.elementsToUpperCaseToMap(strings);
        assertTrue(result.equals(Map.of("nine", "NINE", "six", "SIX", "four", "FOUR", "one", "ONE", "seven", "SEVEN", "two", "TWO", "three", "THREE", "five", "FIVE", "eight", "EIGHT")));
    }

    @Test
    void findWordsByPredicates() {
        List<String> result = wws.findWordsByPredicates(strings);
        assertEquals(Arrays.asList("FOUR", "FIVE"), result);
    }
}