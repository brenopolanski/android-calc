package com.brenopolanski.calc.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by root on 08/03/18.
 */

public class CalcTest {
    private Calc calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calc();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void testSum() throws Exception {
        double input1 = 1;
        double input2 = 2;
        double expected = 3;
        double delta = 0.1;
        double output;

        output = calc.sum(input1, input2);
        assertEquals(expected, output, delta);

        input1 = 5.5;
        input2 = 0.3;
        expected = 5.8;
        output = 0;

        output = calc.sum(input1, input2);
        assertEquals(expected, output, delta);
    }

    @Test(expected = NullPointerException.class)
    public void testSumNulls() throws NullPointerException {
        calc.sum(Double.parseDouble(null), Double.parseDouble(null));
    }

    @Test
    public void testMinus() throws Exception {
        double input1 = 10;
        double input2 = 5;
        double expected = 5;
        double delta = 0.1;
        double output;

        output = calc.minus(input1, input2);
        assertEquals(expected, output, delta);

        input1 = 8;
        input2 = 10;
        expected = -2;
        output = 0;

        output = calc.minus(input1, input2);
        assertEquals(expected, output, delta);
    }

    @Test(expected = NullPointerException.class)
    public void testMinusNulls() throws NullPointerException {
        calc.minus(Double.parseDouble(null), Double.parseDouble(null));
    }

    @Test
    public void testMultiplication() throws Exception {
        double input1 = 100;
        double input2 = 2;
        double expected = 200;
        double delta = 0.1;
        double output;

        output = calc.multiplication(input1, input2);
        assertEquals(expected, output, delta);
    }

    @Test(expected = NullPointerException.class)
    public void testMultiplicationNulls() throws NullPointerException {
        calc.multiplication(Double.parseDouble(null), Double.parseDouble(null));
    }

    @Test
    public void testDivision() throws Exception {
        double input1 = 88;
        double input2 = 8;
        BigDecimal expected = new BigDecimal("11");
        BigDecimal output;

        output = calc.division(input1, input2);
        assertEquals(expected, output);
    }

    @Test(expected = NullPointerException.class)
    public void testDivisionNulls() throws NullPointerException {
        calc.division(Double.parseDouble(null), Double.parseDouble(null));
    }
}
