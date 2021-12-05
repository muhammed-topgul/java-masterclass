package com.muhammedtopgul.javamasterclass.oop.basic._override;

/**
 * @author muhammed-topgul 
 * @created at 18.11.2021 13:39
 */

public class Manager extends Employee {

    private static final int EMPLOYEE_SALARY = 3500;

    public Manager(String id, String name, String department, int year) {
        super(id, name, department, year);
    }

    @Override
    public void salary() {
        System.out.println("Manager Salary: " + getYear() * EMPLOYEE_SALARY);
    }

    // Covariant return type
    @Override
    public Manager getPerson() {
        return this;
    }
}
