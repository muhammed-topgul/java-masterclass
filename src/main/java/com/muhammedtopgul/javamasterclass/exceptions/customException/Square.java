package com.muhammedtopgul.javamasterclass.exceptions.customException;

/**
 * @author muhammed-topgul created at 05/12/2021 20:34
 */

public class Square implements Shape {

    private double side;

    public Square(double side) throws NegativeArgumentException {
        if (side < 0)
            throw new NegativeArgumentException("Cannot pass negative values.", side);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
