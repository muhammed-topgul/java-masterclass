package com.muhammedtopgul.javamasterclass.arrays;

/**
 * @author muhammed-topgul created at 06/11/2021 20:58
 */

public class PassParameterToMainMethod {

    public static void main(String[] args) {
        if (args.length == 3) {
            String firstName = args[0];
            String lastName = args[1];
            String age = args[2];
            System.out.println(firstName + " " + lastName + " " + age);
        } else {
            System.out.println("Please provide three arguments");
            System.exit(1);
        }
    }
}
