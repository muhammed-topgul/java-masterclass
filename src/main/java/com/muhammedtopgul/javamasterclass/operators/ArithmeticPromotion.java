package com.muhammedtopgul.javamasterclass.operators;

/**
 * @author muhammed-topgul 
 * @created at 31.10.2021 18:10
 * The result of arithmatic operations in Java returns int at minimum
 * if you add two bytes the result is int not byte (byte _byte1 = 8, _byte2 = 5; _byte1 = _byte1 + _byte2; // cast error)
 */
public class ArithmeticPromotion {

    public static void main(String[] args) {
        int i = 5;
        double d = 2.3;
        // i = i + d; // cast error
        d = d + i;

        byte _byte1 = 8, _byte2 = 5;
        // _byte1 = _byte1 + _byte2; // cast error
        i = _byte1 + _byte2;

        // B.A in compound assigment no cast needed
        i = (int) (i + d); // need to cast
        i += d; // no need to cast
        System.out.println(i);
    }
}
