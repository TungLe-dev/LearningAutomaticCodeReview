package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {

    @Test
    void testAdd() {
        assertEquals(5.0, Calculation.add(2, 3), 1e-9);
    }

    @Test
    void testSubtract() {
        assertEquals(-1.0, Calculation.subtract(2, 3), 1e-9);
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, Calculation.multiply(2, 3), 1e-9);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Calculation.divide(6, 3), 1e-9);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculation.divide(1, 0));
    }
}

