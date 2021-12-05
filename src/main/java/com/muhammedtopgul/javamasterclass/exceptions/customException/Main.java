package com.muhammedtopgul.javamasterclass.exceptions.customException;

/**
 * @author muhammed-topgul 
 * @created at 05.12.2021 20:35
 */

public class Main {

    public static void main(String[] args) {
        try {
            Shape shape = new Circle(-10);
            System.out.println(shape.calculateArea());
        } catch (NegativeArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Shape shape = new Square(-1);
            System.out.println(shape.calculateArea());
        } catch (NegativeArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
