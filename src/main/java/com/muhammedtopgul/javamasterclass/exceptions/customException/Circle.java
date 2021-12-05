package com.muhammedtopgul.javamasterclass.exceptions.customException;

/**
 * @author muhammed-topgul created at 05/12/2021 20:32
 */

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) throws NegativeArgumentException {
        if (radius < 0)
            throw new NegativeArgumentException("Cannot pass negative values.", radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
