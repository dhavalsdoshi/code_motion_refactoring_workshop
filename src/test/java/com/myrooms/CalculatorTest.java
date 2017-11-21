package com.myrooms;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    @Test
    public void testAdd()
    {
        assertEquals(4, Calculator.add(2, 2), 0);
    }

    @Test
    public void testSubtract()
    {
        assertEquals(2, Calculator.subtract(4, 2), 0);
    }
}
