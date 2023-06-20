package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void add_TwoNumbersReturns1504() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1504, stringCalculator.addTwoNumbers(1500, 4));
    }

}