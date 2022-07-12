package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void test(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }
}