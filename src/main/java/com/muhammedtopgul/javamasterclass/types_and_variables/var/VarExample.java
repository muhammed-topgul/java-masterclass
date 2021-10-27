package com.muhammedtopgul.javamasterclass.types_and_variables.var;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author muhammed-topgul created at 27/10/2021 20:56
 * 'var' is a reserved word, not a keyword
 * 'var' used only local variables
 * class name or interface name cannot be 'var' after Java 10
 */

public class VarExample {

    // var name = "muhammed"; will not compile

    public static void main(String[] args) {
        // var a; will no compile

        var car = new Car();
        car.setBrand("BMW");
        car.setYear(2019);

        System.out.println(car);

        var date = new Date();
        System.out.println(date);


        var intArray = new int[2];
        intArray[0] = 100;
        intArray[1] = 200;

        for (int i : intArray) {
            System.out.println(i);
        }

        var list = new ArrayList<>();
        System.out.println(list.size());

        var isEmpty = " ".isEmpty();
        var isBlank = " ".isBlank();

        System.out.println(isEmpty);
        System.out.println(isBlank);
    }

//    public static var getCar() {   will not compile
//        return new Car();
//    }
}
