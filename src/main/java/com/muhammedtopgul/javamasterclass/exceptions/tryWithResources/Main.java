package com.muhammedtopgul.javamasterclass.exceptions.tryWithResources;

/**
 * @author muhammed-topgul 
 * @since 02.12.2021 17:15
 */

public class Main {

    public static void main(String[] args) {
//        run0();
        run1();
    }

    public static void run0() {
        ClosableClass closableClass = null;
        try {
            closableClass = new ClosableClass("unique", false);
            System.out.println("in try block.");
            throwException();
            closableClass.close();
        } catch (Exception e) {
            System.out.println("in catch block.");
            try {
                if (closableClass.isOpen())
                    closableClass.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            System.out.println("in finally()");
            try {
                if (closableClass.isOpen())
                    closableClass.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        System.out.println("After try block.");
    }

    public static void run1() {
        try (ClosableClass closableClass = new ClosableClass("unique", false)) {
            System.out.println("in try block.");
            throwException();
        } catch (Exception e) {
            System.out.println("in catch block.");
        } finally {
            System.out.println("finally here :)");
        }
        System.out.println("After try block.");
    }

    public static void run2() {
        try (ClosableClass closableClass1 = new ClosableClass("first", false); ClosableClass closableClass2 = new ClosableClass("second", false)) {
            System.out.println("in try block.");
            throwException();
        } catch (Exception e) {
            System.out.println("in catch block.");
        } finally {
            System.out.println("finally here :)");
        }
        System.out.println("After try block.");
    }

    public static void run3() {
        try (ClosableClass closableClass1 = new ClosableClass("first", false); ClosableClass closableClass2 = new ClosableClass("second", true)) {
            System.out.println("in try block.");
            throwException();
        } catch (Exception e) {
            System.out.println("in catch block.");
        } finally {
            System.out.println("finally here :)");
        }
        System.out.println("After try block.");
    }

    public static void throwException() throws Exception {
        System.out.println("Throwing an exception!");
        throw new Exception();
    }
}
