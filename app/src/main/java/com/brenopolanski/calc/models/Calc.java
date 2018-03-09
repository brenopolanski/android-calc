package com.brenopolanski.calc.models;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by root on 08/03/18.
 */

public class Calc {
    public int sum(Integer input1, Integer input2) {
        return input1 + input2;
    }

    public int minus(Integer input1, Integer input2) {
        return input1 - input2;
    }

    public int multiplication(Integer input1, Integer input2) {
        return input1 * input2;
    }

    public BigDecimal division(Integer input1, Integer input2) {
        BigDecimal bigDecimalInput1 = new BigDecimal(input1);
        BigDecimal bigDecimalInput2 = new BigDecimal(input2);

        return bigDecimalInput1.divide(bigDecimalInput2, MathContext.DECIMAL32);
    }
}
