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
        int input1 = 1;
        int input2 = 2;
        int expected = 3;
        int output;

        output = calc.sum(input1, input2);
        assertEquals(expected, output);

        input1 = 9;
        input2 = 9;
        expected = 18;
        output = 0;

        output = calc.sum(input1, input2);
        assertEquals(expected, output);
    }

    @Test(expected = NumberFormatException.class)
    public void testSumNulls() throws NumberFormatException {
        calc.sum(Integer.parseInt(null), Integer.parseInt(null));
    }

    @Test
    public void testMinus() throws Exception {
        int input1 = 10;
        int input2 = 5;
        int expected = 5;
        int output;

        output = calc.minus(input1, input2);
        assertEquals(expected, output);

        input1 = 8;
        input2 = 10;
        expected = -2;
        output = 0;

        output = calc.minus(input1, input2);
        assertEquals(expected, output);
    }

    @Test(expected = NumberFormatException.class)
    public void testMinusNulls() throws NumberFormatException {
        calc.minus(Integer.parseInt(null), Integer.parseInt(null));
    }

    @Test
    public void testMultiplication() throws Exception {
        int input1 = 100;
        int input2 = 2;
        int expected = 200;
        int output;

        output = calc.multiplication(input1, input2);
        assertEquals(expected, output);
    }

    @Test(expected = NumberFormatException.class)
    public void testMultiplicationNulls() throws NumberFormatException {
        calc.multiplication(Integer.parseInt(null), Integer.parseInt(null));
    }

    @Test
    public void testDivision() throws Exception {
        int input1 = 88;
        int input2 = 8;
        BigDecimal expected = new BigDecimal("11");
        BigDecimal output;

        output = calc.division(input1, input2);
        assertEquals(expected, output);
    }

    @Test(expected = NumberFormatException.class)
    public void testDivisionNulls() throws NumberFormatException {
        calc.division(Integer.parseInt(null), Integer.parseInt(null));
    }
}
