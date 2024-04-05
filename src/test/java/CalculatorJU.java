import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorJU {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals("Test Add is wrong", 2, calculator.add(1, 1));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("Test Subtract is wrong", 0, calculator.subtract(1, 1));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("Test Multiply is wrong", 4, calculator.multiply(2, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals("Test Divide is wrong", 2, calculator.divide(4, 2));
    }
}
