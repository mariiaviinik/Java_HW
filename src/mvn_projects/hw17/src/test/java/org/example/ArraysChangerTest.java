package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysChangerTest {
    ArraysChanger ac = new ArraysChanger();

    @DisplayName("CONTAINS NO 4")
    @Test
    void getNumbersAfterFirst4_hasNo4() {
        int[] arr = {1, 2, 3, 7, 5, 6};
        assertThrows(RuntimeException.class, () -> {
            ac.getNumbersAfterFirst4(arr);
        });
    }

    @DisplayName("NOT EMPTY")
    @Test
    void getNumbersAfterFirst4_NotEmptyArray() {
        int[] arr = {};
        assertNull(ac.getNumbersAfterFirst4(arr));
    }

    @DisplayName("WORKS CORRECTLY")
    @Test
    void getNumbersAfterFirst4_ReturnCorrectResult() {
        int[] resultArray1 = ac.getNumbersAfterFirst4(new int[]{5, 6, 7, 8, 4, 8, 9, 10});
        int[] resultArray2 = ac.getNumbersAfterFirst4(new int[]{5, 6, 7, 8, 8, 9, 10, 4});
        int[] resultArray3 = ac.getNumbersAfterFirst4(new int[]{5, 6, 7, 8, 4, 8, 9, 10, 4});

        assertArrayEquals(new int[]{8, 9, 10}, resultArray1);
        assertArrayEquals(new int[]{}, resultArray2);
        assertArrayEquals(new int[]{8, 9, 10, 4}, resultArray3);
    }

    @Test
    void notIncludeNumber4() {
        boolean result = ac.checkIncluding1And4(new int[]{5, 6, 7, 8, 1, 8, 9, 10});

        assertFalse(result);
    }

    @Test
    void notIncludeNumber1() {
        boolean result = ac.checkIncluding1And4(new int[]{5, 6, 7, 8, 4, 8, 9, 10});

        assertFalse(result);
    }

    @Test
    void has1And4() {
        boolean result = ac.checkIncluding1And4(new int[]{1, 5, 6, 7, 8, 4, 8, 9, 10});

        assertTrue(result);
    }
}