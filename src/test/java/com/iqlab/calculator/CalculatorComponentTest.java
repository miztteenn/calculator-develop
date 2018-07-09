package com.iqlab.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorComponentTest {
    private CalculatorComponent calc = new CalculatorComponent();

    @Test
    public void add() {
        assertEquals(0, calc.add(0,0));
        assertEquals(3, calc.add(1,2));
    }
}
