package telran.introduction;

import static telran.introduction.Calculations.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculationsTests {
    @Test
    void sumTest()
    {
        assertEquals(5, sum(2, 3));
    }

    @Test
    void difTest()
    {
        assertEquals(-1, dif(2, 3));
        assertEquals(2, dif(3, 1));
    }

    @Test
    void mulTest()
    {
        assertEquals(12, mul(4, 3));
        
    }

    @Test
    void divTest()
    {
        assertEquals(4, div(8, 2));
    }

    @Test
    void sumOfDigitsTest()
    {
        assertEquals(12, sumOfDigits(21018));
    }

    @Test
    void maxDigitTest()
    {
        assertEquals(6, maxDigit(16023));
    }

    @Test
    void isDividedOnTest()
    {
        assertTrue(isDividedOn(21, 7));
        assertFalse(isDividedOn(1, 0));
    }

}

