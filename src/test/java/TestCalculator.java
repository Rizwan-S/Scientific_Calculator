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
}
