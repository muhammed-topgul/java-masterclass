package com.muhammedtopgul.javamasterclass.operators;

/**
 * @author muhammed-topgul created at 31/10/2021 19:08
 */

public class ConditionalOperators {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 & b2;
        boolean b4 = b1 | b2;
        boolean b5 = b1 ^ b2;

        print("b1 & b2: " + b3);
        print("b1 | b2: " + b4);
        print("b1 ^ b2: " + b5);

        print("\n");

        if ((getOne() == 2) & (getTwo() == 2)) {
            print("& Case Success...");
        }
        print("---------- End Of &----------\n");

        if ((getOne() == 2) && (getTwo() == 2)) {
            print("&& Case Success...");
        }
        print("---------- End Of &&----------\n");

        if ((getOne() == 1) | (getTwo() == 1)) {
            print("| Case Success...");
        }
        print("---------- End Of |----------\n");

        if ((getOne() == 1) || (getTwo() == 1)) {
            print("|| Case Success...");
        }
        print("---------- End Of ||----------\n");
    }

    public static int getOne() {
        print("getOne() called.");
        return 1;
    }

    public static int getTwo() {
        print("getTwo() called.");
        return 2;
    }

    public static void print(String output) {
        System.out.println(output);
    }
}
