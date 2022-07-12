package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Disabled
    @Test
    public void add(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        assertNotNull(result);
        assertEquals(3, result);
        assertTrue(result > 1);
    }

    @DisplayName("除法")
    @Test
    public void divide(){
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);
        });
    }
}