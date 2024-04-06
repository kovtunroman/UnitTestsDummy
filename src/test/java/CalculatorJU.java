import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CalculatorJU {
    Random random = new Random();
    int argumentFirst = random.nextInt(100);
    int argumentSecond = random.nextInt(100);

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals("Test Add is wrong", argumentFirst + argumentSecond, calculator.add(argumentFirst, argumentSecond));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("Test Subtract is wrong", argumentFirst - argumentSecond, calculator.subtract(argumentFirst, argumentSecond));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("Test Multiply is wrong", argumentFirst * argumentSecond, calculator.multiply(argumentFirst, argumentSecond));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals("Test Divide is wrong", argumentFirst / argumentSecond, calculator.divide(argumentFirst, argumentSecond));
    }
}
