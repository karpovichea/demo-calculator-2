package by.itacademy.ekaterinakarpovich.calculator2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdditionPositiveNumbers() {
        assertEquals(3.33, calculator.add(1.11, 2.22), 0.001);
    }
}
