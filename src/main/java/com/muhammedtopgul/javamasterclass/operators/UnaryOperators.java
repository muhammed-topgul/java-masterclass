package com.muhammedtopgul.javamasterclass.operators;

/**
 * @author muhammed-topgul created at 31/10/2021 18:12
 */

public class UnaryOperators {

    public static void main(String[] args) {
        int i = 5;
        // -i; // not a statement
        int j = -i;

        promotion();
        incrementAndDecrementProcessors();
    }

    /**
     * - or + returns int at minimum
     */
    public static void promotion() {
        print("\nPromotion: ");
        byte b1 = 5;
        // - or + returns int at minimum
        // byte b2 = -b1; // cast error
        byte b2 = (byte) -b1;
        byte b3 = (byte) +b1;
        print("b2: " + b2);
        print("b3: " + b3);
    }

    public static void incrementAndDecrementProcessors() {
        print("\nIncrement and Decrement: ");
        int i = 5;

        int j = ++i;
        print(String.format("i= %d, j=%d", i, j));

        j = i++;
        print(String.format("i= %d, j=%d", i, j));

        j = --i;
        print(String.format("i= %d, j=%d", i, j));

        j = i--;
        print(String.format("i= %d, j=%d", i, j));

        i++;
        print(String.format("Now i= %d", i));

        --i;
        print(String.format("Now i= %d", i));

        print(String.format("Now i= %d", ++i));

        print(String.format("Now i= %d", i++));

        print(String.format("Now i= %d", i));
    }

    public static void print(String output) {
        System.out.println(output);
    }
}
