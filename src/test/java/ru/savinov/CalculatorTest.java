package ru.savinov;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testEvaluate() {
        Calculator calc = new Calculator();
        int sum = calc.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}