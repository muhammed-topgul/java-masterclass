package com.muhammedtopgul.javamasterclass.exceptions;

/**
 * @author muhammed-topgul 
 * @since 02.12.2021 17:17
 */

public class ManipulateVariable {

    public static void main(String[] args) {
        User user = new User();
        user.value = "A";
        manipulate(user);

        System.out.println(user.value);
    }

    public static void manipulate(User user) {
        try {
            System.out.println("user.value = B");
            user.value = "B";
            throwException(user);
            System.out.println("user.value = X");
            user.value = "X";
        } catch (Exception e) {
            System.out.println("user.value = D");
            user.value = "D";
        } finally {
            System.out.println("user.value = E");
            user.value = "E";
        }
    }

    public static void throwException(User user) throws Exception {
        System.out.println("user.value = C");
        user.value = "C";
        System.out.println("Throwing an exception!");
        throw new Exception();
    }
}

class User {

    public String value;
}
