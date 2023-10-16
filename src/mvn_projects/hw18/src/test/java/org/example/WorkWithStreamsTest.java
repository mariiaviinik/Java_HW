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
    void elementsToUpperCaseToPair() {
        List<Pair> result = wws.elementsToUpperCaseToPair(strings);
        assertTrue(result.toString().equals("[[one, ONE], [two, TWO], [three, THREE], [four, FOUR], [five, FIVE], [six, SIX], [seven, SEVEN], [eight, EIGHT], [nine, NINE]]"));
    }

    @Test
    void findWordsByPredicates() {
        List<String> result = wws.findWordsByPredicates(strings);
        assertEquals(Arrays.asList("FOUR", "FIVE"), result);
    }
}