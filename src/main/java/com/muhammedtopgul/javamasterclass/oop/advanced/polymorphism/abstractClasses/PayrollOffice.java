package com.muhammedtopgul.javamasterclass.oop.advanced.polymorphism.abstractClasses;

/**
 * @author muhammed-topgul created at 28/11/2021 14:26
 */

public class PayrollOffice {

    public void paySalary(Employee e) {
        double salary = e.calculateSalary();

        if (e instanceof Director) {
            System.out.println("\n*************************");
            System.out.println("Welcome Sir");
            System.out.println("Your salary: " + salary);
            System.out.println("*************************\n");
        } else
            System.out.println("Paying a salary of " + salary + " to " + e.getName());
    }
}
