import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EvenOddCheckerTNG {
    @Test
    public void checkEven() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertTrue(EvenOddChecker.check(2), "EvenOddChecker: number is not even");
    }

    @Test
    public void checkOdd() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertFalse(EvenOddChecker.check(3), "EvenOddChecker: number is not odd");
    }
}
