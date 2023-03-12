import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal;

    @Test
    public void SqRootTruePositive() {
        assertEquals("Finding square root for True Positive", 10, cal.SquareRoot(100), DELTA);
        assertEquals("Finding square root for True Positive", 13, cal.SquareRoot(169), DELTA);
        assertEquals("Finding square root for True Positive", 2, cal.SquareRoot(4), DELTA);
        assertEquals("Finding square root for True Positive", 3, cal.SquareRoot(9), DELTA);
    }

    @Test
    public void SqRootFalsePositive() {
        assertNotEquals("Finding square root for False Positive", 1, cal.SquareRoot(5), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, cal.SquareRoot(6), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, cal.SquareRoot(10), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, cal.SquareRoot(0.5), DELTA);
    }

    @Test
    public void FactorialTruePositive() {
        assertEquals("Finding factorial for True Positive", 6, cal.Factorial(3), DELTA);
        assertEquals("Finding factorial for True Positive", 120, cal.Factorial(5), DELTA);
        assertEquals("Finding factorial for True Positive", 1, cal.Factorial(1), DELTA);
        assertEquals("Finding factorial for True Positive", 0.0, cal.Factorial(0), DELTA);
    }

    @Test
    public void FactorialFalsePostive() {
        assertNotEquals("Finding factorial for False Positive", 1, cal.Factorial(2.5), DELTA);
        assertNotEquals("Finding factorial for False Positive", 5.5, cal.Factorial(3), DELTA);
        assertNotEquals("Finding factorial for False Positive", 59, cal.Factorial(4), DELTA);
        assertNotEquals("Finding factorial for False Positive", 1.9, cal.Factorial(2), DELTA);
    }

    @Test
    public void NaturalLogTruePositive() {
        assertEquals("Finding natural log for True Positive", 2.302585092994046, cal.NaturalLog(10), DELTA);
        assertEquals("Finding natural log for True Positive", 0, cal.NaturalLog(1), DELTA);
    }

    @Test
    public void NaturalLogFalsePositive() {
        assertNotEquals("Finding natural log for False Positive", 7, cal.NaturalLog(15), DELTA);
        assertNotEquals("Finding natural log for False Positive", 4.5, cal.NaturalLog(12.3), DELTA);
    }

    @Test
    public void PowerTruePositive() {
        assertEquals("Finding power for True Positive", 8, cal.Power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", -91.125, cal.Power(-4.5, 3), DELTA);
    }

    @Test
    public void PowerFalsePositive() {
        assertNotEquals("Finding power for False Positive", 6, cal.Power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 27, cal.Power(-3, 3), DELTA);
    }
}
