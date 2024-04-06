import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddChekerJU {

    @Test
    public void checkEven(){
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertTrue("EvenOddChecker: number is not even", EvenOddChecker.check(2));
    }

    @Test
    public void checkOdd(){
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertFalse("EvenOddChecker: number is not odd", EvenOddChecker.check(3));
    }
}
