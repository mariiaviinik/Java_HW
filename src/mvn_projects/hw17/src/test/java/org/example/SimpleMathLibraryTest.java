package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathLibraryTest {
    private int num1 = 3;
    private int num2 = -7;

    @DisplayName("Function Add")
    @Test
    void add() {
        if (num1 + num2 == -4) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
//        assertEquals(-4, num1 + num2);
    }

    @DisplayName("Function Minus")
    @Test
    void minus() {
        if (num1 - num2 == 10) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
//        assertEquals(10, num1 - num2);
    }
}