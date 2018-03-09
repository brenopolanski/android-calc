package com.brenopolanski.calc.models;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by root on 08/03/18.
 */

public class Calc {
    public double sum(double input1, double input2) {
        return input1 + input2;
    }

    public double minus(double input1, double input2) {
        return input1 - input2;
    }

    public double multiplication(double input1, double input2) {
        return input1 * input2;
    }

    public BigDecimal division(double input1, double input2) {
        BigDecimal bigDecimalInput1 = new BigDecimal(input1);
        BigDecimal bigDecimalInput2 = new BigDecimal(input2);

        return bigDecimalInput1.divide(bigDecimalInput2, MathContext.DECIMAL32);
    }
}
