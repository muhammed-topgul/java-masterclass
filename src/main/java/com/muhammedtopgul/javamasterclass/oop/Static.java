package com.muhammedtopgul.javamasterclass.oop;

/**
 * @author muhammed-topgul created at 08/11/2021 21:18
 */

public class Static {
    public static int number = 10;

    public static void main(String[] args) {
        Static _static = new Static();
        System.out.println(Static.number);
        Static.setNumber(50);
        System.out.println(_static.getDefinition());
    }

    static void setNumber(int number) {
        Static.number = number;
    }

    static String getName() {
        return "Muhammed " + number;
    }

    public String getDefinition() {
        return getName() + " Topgül-" + Static.number;
    }
}
