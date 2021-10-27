package com.muhammedtopgul.javamasterclass.numbers;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author muhammed-topgul created at 21/10/2021 16:02
 */

public class Main {

    public static void main(String[] args) {
        double doubleSum = 0.0d;
        for (int i = 0; i < 100; i++) {
            doubleSum += 0.1d;
        }
        System.out.println(doubleSum);

        float floatSum = 0.0f;
        for (int i = 0; i < 100; i++) {
            floatSum += 0.1f;
        }
        System.out.println(floatSum);

        BigDecimal bigDecimalSum = new BigDecimal(0.0);
        for (int i = 0; i < 100; i++) {
            bigDecimalSum = bigDecimalSum.add(new BigDecimal(0.1), new MathContext(20));
        }
        System.out.println(bigDecimalSum);
    }
}
