import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class CalculatorTNG {
    Random random = new Random();
    int argumentFirst = random.nextInt(100);
    int argumentSecond = random.nextInt(100);

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(argumentFirst + argumentSecond, calculator.add(argumentFirst, argumentSecond), "Test Add is wrong");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(argumentFirst - argumentSecond, calculator.subtract(argumentFirst, argumentSecond), "Test Subtract is wrong");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(argumentFirst * argumentSecond, calculator.multiply(argumentFirst, argumentSecond), "Test Multiply is wrong");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(argumentFirst / argumentSecond, calculator.divide(argumentFirst, argumentSecond), "Test Divide is wrong");
    }
}
